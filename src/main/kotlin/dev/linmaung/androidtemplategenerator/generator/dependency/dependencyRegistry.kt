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
    ),
    "room" to listOf(
        DependencyInfo(
            name= "room-compiler",
            version = VersionConstant.room,
            library = LibraryConstant.roomCompiler,
        ),
        DependencyInfo(
            name= "room-runtime",
            version = VersionConstant.room,
            library = LibraryConstant.roomRuntime,
        ),
        DependencyInfo(
            name= "room-ktx",
            version = VersionConstant.room,
            library = LibraryConstant.roomKtx,
        ),
        DependencyInfo(
            name= "room-paging",
            version = VersionConstant.room,
            library = LibraryConstant.roomPaging,)
    ),
    "glide" to listOf(
        DependencyInfo(
            name= "glide",
            version = VersionConstant.glide,
            library = LibraryConstant.glide,
        )
    ),
    "navigation" to listOf(
        DependencyInfo(
            name= "navigation-compose",
            version = VersionConstant.navigation,
            library = LibraryConstant.navigation,
        )
    ),
    "timber" to listOf(
        DependencyInfo(
            name= "timber",
            version = VersionConstant.timber,
            library = LibraryConstant.timber,
        )
    ),
    "chucker" to listOf(
        DependencyInfo(name = "chucker", version = VersionConstant.chucker, library = LibraryConstant.chucker),
        DependencyInfo(name = "chucker-no-op", version = VersionConstant.chucker, library= LibraryConstant.chuckerNoOp)
    ),
)

val pluginRegistry = mapOf(
    "hilt" to Plugins.hilt,
    "ksp" to Plugins.ksp,
    "kapt" to Plugins.kapt,
    "library" to Plugins.library,
    "jetbrainsKotlinJvm" to Plugins.jetbrainsKotlinJvm
)

val intermediateModuleRegistry= listOf(
    ModuleInfo("app"),
    ModuleInfo("core"),
    ModuleInfo("data"),
    ModuleInfo("domain"),
    ModuleInfo("feature:home")
)

val versionRegistry= mapOf(
    "retrofit" to listOf(
        VersionConstant.retrofit,
        VersionConstant.okhttp,
    ),
    "kotlin" to listOf(
        VersionConstant.kotlin
    ),
    "hilt" to listOf(
        VersionConstant.hilt,
        VersionConstant.hiltx,
    ),
    "coroutines" to listOf(
        VersionConstant.coroutines
    ),
    "viewmodel" to listOf(
        VersionConstant.lifecycle
    ),
    "ksp" to listOf(
        VersionConstant.ksp
    ),
    "koin" to listOf(
        VersionConstant.koin
    ),
    "ktor" to listOf(
        VersionConstant.ktor
    ),
    "room" to listOf(
        VersionConstant.room
    ),
    "navigation" to listOf(
        VersionConstant.navigation
    ),
    "glide" to listOf(
        VersionConstant.glide
    ),
    "timber" to listOf(
        VersionConstant.timber
    ),
    "chucker" to listOf(
        VersionConstant.chucker
    ),
    "jetbrainsKotlinJvm" to listOf(
        VersionConstant.jetbrainsKotlinJvm
    )
)

object VersionConstant{
    val retrofit= VersionRequirement("retrofit","3.0.0")
    val okhttp = VersionRequirement("okhttp", "5.1.0")
    val kotlin= VersionRequirement("kotlin", "2.2.20")
    val agp= VersionRequirement("agp","8.13.0")

    val hilt= VersionRequirement("hilt","2.57.2")
    val hiltx= VersionRequirement("hiltx","1.3.0")

    val coroutines= VersionRequirement("coroutines","1.10.2")
    val lifecycle= VersionRequirement("viewmodel", "2.7.3")
    val ksp= VersionRequirement("ksp", "2.2.20-2.0.2")
    val koin= VersionRequirement("koin","4.1.1")

    val ktor = VersionRequirement("ktor","3.3.0")
    val room = VersionRequirement("room","2.8.1")
    val glide= VersionRequirement("glide","5.0.5")
    val chucker= VersionRequirement("chucker","4.2.0")
    val navigation= VersionRequirement("navigation","2.7.0")
    val timber= VersionRequirement("timber","5.0.1")
    val jetbrainsKotlinJvm= VersionRequirement("jetbrainsKotlinJvm","2.2.20")

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

    val roomCompiler= LibraryRequirement("room-compiler","androidx.room:room-compiler", VersionConstant.room)
    val roomRuntime= LibraryRequirement("room-runtime","androidx.room:room-runtime", VersionConstant.room)
    val roomKtx= LibraryRequirement("room-ktx","androidx.room:room-ktx", VersionConstant.room)
    val roomPaging= LibraryRequirement("room-paging","androidx.room:room-paging", VersionConstant.room)

    val glide= LibraryRequirement("glide","com.github.bumptech.glide:glide", VersionConstant.glide)

    val navigation= LibraryRequirement("navigation-compose","androidx.navigation:navigation-compose", VersionConstant.navigation)

    val timber= LibraryRequirement("timber","com.jakewharton.timber:timber", VersionConstant.timber)

    val chucker= LibraryRequirement("chucker","com.github.chuckerteam.chucker:library", VersionConstant.chucker)
    val chuckerNoOp= LibraryRequirement("chucker-no-op","com.github.chuckerteam.chucker:library-no-op", VersionConstant.chucker)

}

object Plugins{
    val hilt= PluginRequirement("hilt","com.google.dagger.hilt.android", VersionConstant.hilt)
    val ksp= PluginRequirement("ksp","com.google.devtools.ksp", VersionConstant.ksp)
    val kapt= PluginRequirement("kapt","org.jetbrains.kotlin.kapt", VersionConstant.kotlin)
    val library= PluginRequirement("library","com.android.library", VersionConstant.agp)
    val jetbrainsKotlinJvm= PluginRequirement("jetbrains-kotlin-jvm","org.jetbrains.kotlin.jvm", VersionConstant.jetbrainsKotlinJvm)
}