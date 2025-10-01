package dev.linmaung.androidtemplategenerator.generator.dependency

data class DependencyInfo(
    // this can be implementation, kapt, testImplementation, androidTestImplementation
    val type: String = Dependency.IMPLEMENTATION.toString().lowercase(),
    val name: String,
    val version: VersionRequirement,
    val libraryRequirement: LibraryRequirement,
)

enum class Dependency{
    IMPLEMENTATION,
    KAPT,
    API,
    TEST_IMPLEMENTATION,
    ANDROID_TEST_IMPLEMENTATION,
}

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