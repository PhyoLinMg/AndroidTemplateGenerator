package dev.linmaung.androidtemplategenerator.generator.templates

data class GenericPath(
    val templatePath: String,
    val targetDirectory: String,
    val targetFilename: String? = null // Optional custom filename
)
