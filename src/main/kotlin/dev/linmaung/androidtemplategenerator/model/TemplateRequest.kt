package dev.linmaung.androidtemplategenerator.model

data class TemplateRequest(
    val projectName: String,
    val packageName: String,
    val compilerType: String = "ksp",
    val dependencyList: List<String> = listOf("hilt", "retrofit","coroutines","viewmodel").map { it.lowercase() },
){
    val pluginList: List<String>
        get() {
            val plugins = mutableListOf<String>()

            // Add dependency-specific plugins
            if (dependencyList.contains("hilt")) {
                plugins.add("hilt")
            }

            // Add compiler plugin if any dependency needs annotation processing
            val requiresAnnotationProcessing = listOf("hilt", "room", "moshi")
            if (dependencyList.any { it in requiresAnnotationProcessing }) {
                plugins.add(compilerType.lowercase())
            }

            return plugins.distinct()
        }


}