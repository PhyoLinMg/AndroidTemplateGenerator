package dev.linmaung.androidtemplategenerator.generator.dependency

private val dependencyRegistry= mapOf(
    "kotlin" to listOf(
        DependencyInfo(
            version = VersionRequirement("kotlin_version", "1.8.10"),
            plugin = PluginRequirement(
                key = "kotlin_plugin",
                id = "org.jetbrains.kotlin.android",
                version = VersionRequirement("kotlin_version", "1.8.10")
            ),
            libraryRequirement = LibraryRequirement(
                key = "kotlin_stdlib",
                module = "org.jetbrains.kotlin:kotlin-stdlib",
                version = VersionRequirement("kotlin_version", "1.8.10")
            )
        )
    ),
    "coroutines" to listOf(
        DependencyInfo(
            version = VersionRequirement("coroutines_version", "1.6.4"),
            libraryRequirement = LibraryRequirement(
                key = "coroutines_core",
                module = "org.jetbrains.kotlinx:kotlinx-coroutines-core",
                version = VersionRequirement("coroutines_version", "1.6.4")
            )
        )
    ),
    "serialization" to listOf(
        DependencyInfo(
            version = VersionRequirement("serialization_version", "1.5.0"),
            plugin = PluginRequirement(
                key = "serialization_plugin",
                id = "org.jetbrains.kotlin.plugin.serialization",
                version = VersionRequirement("serialization_version", "1.5.0")
            ),
            libraryRequirement = LibraryRequirement(
                key = "serialization_json",
                module = "org.jetbrains.kotlinx:kotlinx-serialization-json",
                version = VersionRequirement("serialization_version", "1.5.0")
            )
        )
    ),
    "hilt" to listOf(
        DependencyInfo(
            version = VersionRequirement("hilt_version", "2.44"),
            plugin = PluginRequirement(
                key = "hilt_plugin",
                id = "com.google.dagger.hilt.android",
                version = VersionRequirement("hilt_version", "2.44")
            ),
            libraryRequirement = LibraryRequirement(
                key = "hilt_android",
                module = "com.google.dagger:hilt-android",
                version = VersionRequirement("hilt_version", "2.44")
            )
        )
    ),
    "retrofit" to listOf(
        DependencyInfo(
            version = VersionRequirement("retrofit_version", "2.9.0"),
            libraryRequirement = LibraryRequirement(
                key = "retrofit",
                module = "com.squareup.retrofit2:retrofit",
                version = VersionRequirement("retrofit_version", "2.9.0")
            )
        )
    ),
    "ktor" to listOf(
        DependencyInfo(
            version = VersionRequirement("ktor_version", "2.3.4"),
            libraryRequirement = LibraryRequirement(
                key = "ktor_client_core",
                module = "io.ktor:ktor-client-core",
                version = VersionRequirement("ktor_version", "2.3.4")
            )
        ),
        DependencyInfo(
            version = VersionRequirement("ktor_version", "2.3.4"),
            libraryRequirement = LibraryRequirement(
                key = "ktor_client_cio",
                module = "io.ktor:ktor-client-cio",
                version = VersionRequirement("ktor_version", "2.3.4")
            )
        ),
        DependencyInfo(
            version = VersionRequirement("ktor_version", "2.3.4"),
            libraryRequirement = LibraryRequirement(
                key = "ktor_client_logging",
                module = "io.ktor:ktor-client-logging",
                version = VersionRequirement("ktor_version", "2.3.4")
            )
        ),
        DependencyInfo(
            version = VersionRequirement("ktor_version", "2.3.4"),
            libraryRequirement = LibraryRequirement(
                key = "ktor_client_content_negotiation",
                module = "io.ktor:ktor-client-content-negotiation",
                version = VersionRequirement("ktor_version", "2.3.4")
            )
        ),
        DependencyInfo(
            version = VersionRequirement("ktor_version", "2.3.4"),
            libraryRequirement = LibraryRequirement(
                key = "ktor_serialization_kotlinx_json",
                module = "io.ktor:ktor-serialization-kotlinx-json",
                version = VersionRequirement("ktor_version", "2.3.4")
            )
        )
    ),
)

object VersionConstant{

}