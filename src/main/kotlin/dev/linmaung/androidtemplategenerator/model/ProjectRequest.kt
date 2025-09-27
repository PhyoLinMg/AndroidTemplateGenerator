package dev.linmaung.androidtemplategenerator.model

data class ProjectRequest(
    val projectName: String,
    val packageName: String,
    val useRetrofit: Boolean = false,
    val useKtor: Boolean = false,
    val useCoroutines: Boolean = false,
    val useCompose: Boolean = true
)
