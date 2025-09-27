package dev.linmaung.androidtemplategenerator.generator.templates.basic



//data class BasicPath(
//    val templatePath: String,
//    val targetDirectory: String,
//)
//
//
//object BasicTemplate {
//    val template= listOf(
//        // that means it will exist in the root directory
//        BasicPath("settings.gradle.kts.ftl",""),
//        // that means it will exist in the app directory which is in the root directory
//        BasicPath("app/build.gradle.kts.ftl","app"),
//        // that means it will exist in the package directory which is in the app/src/main/java directory
//        BasicPath("MainActivity.kt.ftl","app/src/main/java/{packagePath}"),
//    )
//}

data class BasicPath(
    val templatePath: String,
    val targetDirectory: String,
    val targetFilename: String? = null // Optional custom filename
)

object BasicTemplate {
    val templates = listOf(
        // Root directory files
        BasicPath("settings.gradle.kts.ftl", ""),
        BasicPath("build.gradle.kts.ftl", ""),
        // App directory files
        BasicPath("app/build.gradle.kts.ftl", "app", "build.gradle.kts"),


        BasicPath("MainActivity.kt.ftl", "app/src/main/java/{packagePath}"),
        BasicPath("")

    )
}