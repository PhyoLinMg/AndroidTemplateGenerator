import dev.linmaung.androidtemplategenerator.generator.templates.CommonTemplate
import dev.linmaung.androidtemplategenerator.generator.templates.basic.BasicTemplate
import dev.linmaung.androidtemplategenerator.model.ProjectRequest
import freemarker.template.Configuration
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream
import org.springframework.stereotype.Service
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.InputStream
import java.io.StringWriter
import java.nio.file.Files

@Service
class ProjectGenerator(
    private val freemarkerConfig: Configuration
) {
    fun generateBasic(request: ProjectRequest): ByteArray {
        val tempDir = Files.createTempDirectory("android-init").toFile()

        try {
            val model = mapOf(
                "projectName" to request.projectName,
                "packageName" to request.packageName,
                "packagePath" to request.packageName.replace(".", "/"),
                "useRetrofit" to request.useRetrofit,
                "useKtor" to request.useKtor,
                "useCoroutines" to request.useCoroutines,
                "useCompose" to request.useCompose
            )

            // Generate template files using the template list
            val template= BasicTemplate.basicTemplate+ CommonTemplate.commonTemplate
            template.forEach { basicPath ->
                val resolvedTargetDir = resolveTargetDirectory(basicPath.targetDirectory, model, tempDir)
                copyAndProcessTemplate(basicPath.templatePath, resolvedTargetDir, model, basicPath.targetFilename)
            }

            // Create ZIP in memory instead of temporary file
            val byteArrayOutputStream = ByteArrayOutputStream()
            ZipArchiveOutputStream(byteArrayOutputStream).use { zipOut ->
                tempDir.walk()
                    .filter { it.isFile }
                    .forEach { file ->
                        val relativePath = tempDir.toPath().relativize(file.toPath()).toString()
                        val entry = ZipArchiveEntry(relativePath)
                        entry.size = file.length()

                        zipOut.putArchiveEntry(entry)
                        file.inputStream().use { it.copyTo(zipOut) }
                        zipOut.closeArchiveEntry()
                    }
                zipOut.finish() // Ensure all data is written
            }

            return byteArrayOutputStream.toByteArray()
        } finally {
            // Clean up temporary directory
            tempDir.deleteRecursively()
        }
    }

    private fun resolveTargetDirectory(targetDirectory: String, model: Map<String, Any?>, tempDir: File): File {
        return if (targetDirectory.isEmpty()) {
            tempDir
        } else {
            // Replace placeholders like {packagePath} with actual values
            val resolvedPath = targetDirectory.replace("{packagePath}", model["packagePath"].toString())
            File(tempDir, resolvedPath)
        }
    }

    private fun copyAndProcessTemplate(templatePath: String, targetDir: File, model: Map<String, Any?>, targetFilename: String? = null) {
        val isFtlTemplate = templatePath.contains(".ftl")

        if(isFtlTemplate){
            val template =
                freemarkerConfig.getTemplate(templatePath)

            val output = StringWriter().apply {
                template.process(model, this)
            }.toString()
            val filename =
                targetFilename ?: templatePath.substringAfterLast("/").removeSuffix(".ftl")

            val file = File(targetDir, filename)
            file.parentFile.mkdirs()
            file.writeText(output)
        }
        else {
            val file= File(targetDir, targetFilename?:"")
            val sourceFile= File("src/main/resources/templates/$templatePath")
            file.parentFile.mkdirs()
            sourceFile.copyTo(file, overwrite = true)
        }
    }
}