package dev.linmaung.androidtemplategenerator.generator.dependency

data class DependencyInfo(
    val version: VersionRequirement,
    val plugin: PluginRequirement?= null,
    val libraryRequirement: LibraryRequirement,
)

data class VersionRequirement(
    val key:String,
    val version: String
)

data class LibraryRequirement(
    val key: String,
    val module: String,
    val version: VersionRequirement?= null
)

data class BundleRequirement(
    val key: String,
    val members: List<String>?= null
)

data class PluginRequirement(
    val key: String,
    val id: String,
    val version: VersionRequirement
)