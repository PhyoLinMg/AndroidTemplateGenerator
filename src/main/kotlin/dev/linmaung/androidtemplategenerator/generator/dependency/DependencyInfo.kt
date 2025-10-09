package dev.linmaung.androidtemplategenerator.generator.dependency

data class DependencyInfo(
    val name: String,
    val version: VersionRequirement,
    val library: LibraryRequirement,
){
    fun toGradleName(): String = name.replace("-",".")

    fun toType(type:String= "ksp"): String {
        return when(type.lowercase()){
            else -> {
                when (name) {
                    "hilt-compiler" -> if (type=="ksp") "ksp" else "kapt"
                    "room-compiler" -> if (type=="ksp") "ksp" else "kapt"
                    "chucker" -> "debugImplementation"
                    "chucker-no-op" -> "releaseImplementation"
                    else -> "implementation"
                }
            }
        }
    }
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


data class ModuleInfo(
    val path:String
)