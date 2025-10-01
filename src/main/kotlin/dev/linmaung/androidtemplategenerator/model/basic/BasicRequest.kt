package dev.linmaung.androidtemplategenerator.model.basic

data class BasicRequest(
    val projectName: String,
    val packageName: String,
    val compileTime: String= CompileTime.KSP.toString(),
    val networkClientType: String= NetworkClientType.Ktor.toString(),
    val dependencyInjectionType: String = DependencyInjectionType.Hilt.toString()
)

enum class CompileTime{
    KAPT,
    KSP
}


enum class NetworkClientType{
    Retrofit,
    Ktor
}

enum class DependencyInjectionType{
    Hilt,
    Koin,
}


