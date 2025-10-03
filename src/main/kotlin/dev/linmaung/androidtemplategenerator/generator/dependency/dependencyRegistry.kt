package dev.linmaung.androidtemplategenerator.generator.dependency

val dependencyRegistry = mapOf(
    "hilt" to listOf(
        DependencyInfo(
            name= "hilt-android",
            version = VersionConstant.hilt,
            library = LibraryConstant.hiltAndroid,
        ),
        DependencyInfo(
            name= "hilt-compiler",
            version = VersionConstant.hilt,
            library = LibraryConstant.hiltCompiler,
        ),

        DependencyInfo(
            name = "hilt-nav-fragment",
            version = VersionConstant.hiltx,
            library = LibraryConstant.hiltNavFragment
        ),
        DependencyInfo(
            name = "hilt-nav-compose",
            version = VersionConstant.hiltx,
            library = LibraryConstant.hiltNavCompose
        )
    ),
    "retrofit" to listOf(
        DependencyInfo(
            name= "retrofit",
            version = VersionConstant.retrofit,
            library = LibraryConstant.retrofit,
        ),
        DependencyInfo(
            name= "retrofit-gson",
            version = VersionConstant.retrofit,
            library = LibraryConstant.retrofitGson,
        ),
        DependencyInfo(
            name= "okhttp",
            version = VersionConstant.okhttp,
            library = LibraryConstant.okhttp,
        ),
        DependencyInfo(
            name= "okhttp-logging",
            version = VersionConstant.okhttp,
            library = LibraryConstant.okhttpLogging,
        )
    ),
    "koin" to listOf(
        DependencyInfo(
            name= "koin-android",
            version = VersionConstant.koin,
            library = LibraryConstant.koinAndroid,
        ),
        DependencyInfo(
            name= "koin-compose",
            version = VersionConstant.koin,
            library = LibraryConstant.koinCompose,
        ),
    ),
    "ktor" to listOf(
        DependencyInfo(name="ktor-core", library = LibraryConstant.ktorCore, version = VersionConstant.ktor),
        DependencyInfo(name = "ktor-android", library = LibraryConstant.ktorAndroid, version= VersionConstant.ktor),
        DependencyInfo(name = "ktor-logging", library = LibraryConstant.ktorLogging, version = VersionConstant.ktor),
        DependencyInfo(name = "ktor-serialization", library = LibraryConstant.ktorSerialization, version = VersionConstant.ktor),
    ),
    "viewmodel" to listOf(
        DependencyInfo(
            name= "lifecycle-viewmodel",
            version = VersionConstant.lifecycle,
            library = LibraryConstant.lifecycleViewModel,
        ),
    ),
    "coroutines" to listOf(
        DependencyInfo(
            name= "coroutines-core",
            version = VersionConstant.coroutines,
            library = LibraryConstant.coroutinesCore,
        ),
        DependencyInfo(
            name= "coroutines-android",
            version = VersionConstant.coroutines,
            library = LibraryConstant.coroutinesAndroid,
        )
    ),
    "ktor" to listOf(
        DependencyInfo(
            name= "ktor-core",
            version = VersionConstant.ktor,
            library = LibraryConstant.ktorCore,
        ),
        DependencyInfo(
            name= "ktor-android",
            version = VersionConstant.ktor,
            library = LibraryConstant.ktorAndroid,
        ),
        DependencyInfo(
            name= "ktor-logging",
            version = VersionConstant.ktor,
            library = LibraryConstant.ktorLogging,
        ),
        DependencyInfo(
            name= "ktor-serialization",
            version = VersionConstant.ktor,
            library = LibraryConstant.ktorSerialization,
        )
    )
)

val pluginRegistry = mapOf(
    "hilt" to Plugins.hilt,
    "ksp" to Plugins.ksp,
    "kapt" to Plugins.kapt
)

val versionRegistry= mapOf(
    "retrofit" to VersionConstant.retrofit,
    "okhttp" to VersionConstant.okhttp,
    "kotlin" to VersionConstant.kotlin,
    "hilt" to VersionConstant.hilt,
    "hiltx" to VersionConstant.hiltx,
    "coroutines" to VersionConstant.coroutines,
    "lifecycle" to VersionConstant.lifecycle,
    "ksp" to VersionConstant.ksp,
    "koin" to VersionConstant.koin,
    "ktor" to VersionConstant.ktor,
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
    val kapt= PluginRequirement("kapt","org.jetbrains.kotlin.kapt", VersionConstant.kotlin)
}