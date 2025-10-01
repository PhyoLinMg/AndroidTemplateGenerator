package dev.linmaung.androidtemplategenerator.generator.dependency

private val dependencyRegistry = mapOf(
    "hilt" to listOf(
        DependencyInfo(
            name= "hilt-android",
            version = VersionConstant.hilt,
            libraryRequirement = LibraryConstant.hiltAndroid,
        ),
        DependencyInfo(
            type= Dependency.KAPT.toString().lowercase(),
            name= "hilt-compiler",
            version = VersionConstant.hilt,
            libraryRequirement = LibraryConstant.hiltCompiler,
        ),

        DependencyInfo(
            name = "hilt-nav-fragment",
            version = VersionConstant.hilt,
            libraryRequirement = LibraryConstant.hiltNavFragment
        ),
        DependencyInfo(
            name = "hilt-nav-compose",
            version = VersionConstant.hilt,
            libraryRequirement = LibraryConstant.hiltNavCompose
        )
    ),
    "koin" to listOf(
        DependencyInfo(
            name= "koin-android",
            version = VersionConstant.koin,
            libraryRequirement = LibraryConstant.koinAndroid,
        ),
        DependencyInfo(
            name= "koin-compose",
            version = VersionConstant.koin,
            libraryRequirement = LibraryConstant.koinCompose,
        ),
    ),
    "ktor" to listOf(
        DependencyInfo(name="ktor-core", libraryRequirement = LibraryConstant.ktorCore, version = VersionConstant.ktor),
        DependencyInfo(name = "ktor-android", libraryRequirement = LibraryConstant.ktorAndroid, version= VersionConstant.ktor),
        DependencyInfo(name = "ktor-logging", libraryRequirement = LibraryConstant.ktorLogging, version = VersionConstant.ktor),
        DependencyInfo(name = "ktor-serialization", libraryRequirement = LibraryConstant.ktorSerialization, version = VersionConstant.ktor),
    ),

    "viewmodel" to listOf(
        DependencyInfo(
            name= "lifecycle-viewmodel",
            version = VersionConstant.lifecycle,
            libraryRequirement = LibraryConstant.lifecycleViewModel,
        ),
    ),
    "coroutines" to listOf(
        DependencyInfo(
            name= "coroutines-core",
            version = VersionConstant.coroutines,
            libraryRequirement = LibraryConstant.coroutinesCore,
        ),
        DependencyInfo(
            name= "coroutines-android",
            version = VersionConstant.coroutines,
            libraryRequirement = LibraryConstant.coroutinesAndroid,
        )
    ),
    "ktor" to listOf(
        DependencyInfo(
            name= "ktor-core",
            version = VersionConstant.ktor,
            libraryRequirement = LibraryConstant.ktorCore,
        ),
        DependencyInfo(
            name= "ktor-android",
            version = VersionConstant.ktor,
            libraryRequirement = LibraryConstant.ktorAndroid,
        ),
        DependencyInfo(
            name= "ktor-logging",
            version = VersionConstant.ktor,
            libraryRequirement = LibraryConstant.ktorLogging,
        ),
        DependencyInfo(
            name= "ktor-serialization",
            version = VersionConstant.ktor,
            libraryRequirement = LibraryConstant.ktorSerialization,
        )
    )



)

object VersionConstant{
    val retrofit= VersionRequirement("retrofit","3.0.0")
    val okhttp = VersionRequirement("okhttp", "5.1.0")
    val kotlin= VersionRequirement("kotlin", "2.2.20")

    val hilt= VersionRequirement("hilt","2.57.2")
    val hiltx= VersionRequirement("hiltx","1.3.0")

    val coroutines= VersionRequirement("coroutines","1.10.2")
    val lifecycle= VersionRequirement("lifecycle", "2.7.3")
    val ksp= VersionRequirement("ksp", "2.2.20-2.0.2")
    val koin= VersionRequirement("koin","4.1.1")

    val ktor = VersionRequirement("ktor","3.3.0")
}

object LibraryConstant{
    val hiltAndroid= LibraryRequirement("hilt-android","com.google.dagger:hilt-android", VersionConstant.hilt)
    val hiltCompiler= LibraryRequirement("hilt-compiler", module= "com.google.dagger:hilt-compiler", VersionConstant.hilt)
    val hiltNavFragment= LibraryRequirement("hilt-nav-fragment","androidx.hilt:hilt-navigation-fragment", VersionConstant.hiltx)
    val hiltNavCompose= LibraryRequirement("hilt-nav-compose","androidx.hilt:hilt-navigation-compose", VersionConstant.hiltx)

    val koinAndroid= LibraryRequirement("koin-android","io.insert-koin:koin-android", VersionConstant.koin)
    val koinCompose= LibraryRequirement("koin-compose","io.insert-koin:koin-androidx-compose", VersionConstant.koin)

    val ktorCore= LibraryRequirement("ktor-core","io.ktor:ktor-client-core", VersionConstant.ktor)
    val ktorAndroid= LibraryRequirement("ktor-android","io.ktor:ktor-client-android", VersionConstant.ktor)
    val ktorLogging= LibraryRequirement("ktor-logging", "io.ktor:ktor-client-logging", VersionConstant.ktor)
    val ktorSerialization= LibraryRequirement("ktor-serialization","io.ktor:ktor-client-content-negotiation", VersionConstant.ktor)

    val retrofit= LibraryRequirement("retrofit","com.squareup.retrofit2:retrofit", VersionConstant.retrofit)
    val retrofitGson= LibraryRequirement("retrofit-gson","com.squareup.retrofit2:converter-gson", VersionConstant.retrofit)
    val okhttp= LibraryRequirement("okhttp","com.squareup.okhttp3:okhttp", VersionConstant.okhttp)
    val okhttpLogging= LibraryRequirement("okhttp-logging","com.squareup.okhttp3:logging-interceptor", VersionConstant.okhttp)

    val coroutinesCore= LibraryRequirement("coroutines-core","org.jetbrains.kotlinx:kotlinx-coroutines-core", VersionConstant.coroutines)
    val coroutinesAndroid= LibraryRequirement("coroutines-android","org.jetbrains.kotlinx:kotlinx-coroutines-android", VersionConstant.coroutines)

    val lifecycleViewModel= LibraryRequirement("lifecycle-viewmodel","androidx.lifecycle:lifecycle-viewmodel-ktx", VersionConstant.lifecycle)
}

object Plugins{
    val hilt= PluginRequirement("hilt","com.google.dagger.hilt.android", VersionConstant.hilt)
    val ksp= PluginRequirement("ksp","com.google.devtools.ksp", VersionConstant.ksp)
    val kapt= PluginRequirement("kapt","kotlin-kapt", VersionConstant.kotlin)
}