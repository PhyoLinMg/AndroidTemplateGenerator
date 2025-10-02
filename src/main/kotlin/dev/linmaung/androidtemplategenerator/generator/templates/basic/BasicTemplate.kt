package dev.linmaung.androidtemplategenerator.generator.templates.basic

import dev.linmaung.androidtemplategenerator.generator.templates.GenericPath


//data class BasicPath(
//    val templatePath: String,
//    val targetDirectory: String,
//)
//
//
//object BasicTemplate {
//    val template= listOf(
//        // that means it will exist in the root directory
//        BasicPath("settings.gradle.kts.ftl",""),
//        // that means it will exist in the app directory which is in the root directory
//        BasicPath("app/build.gradle.kts.ftl","app"),
//        // that means it will exist in the package directory which is in the app/src/main/java directory
//        BasicPath("MainActivity.kt.ftl","app/src/main/java/{packagePath}"),
//    )
//}

object BasicTemplate {
    val basicTemplate= listOf(

        // App directory files
        GenericPath("basic/app/build.gradle.kts.ftl", "app", "build.gradle.kts"),
        GenericPath("basic/app/Application.kt.ftl", "app/src/main/java/{packagePath}", "Application.kt"),

        GenericPath("basic/MainActivity.kt.ftl", "app/src/main/java/{packagePath}"),

        GenericPath("basic/theme/theme.kt.ftl", "app/src/main/java/{packagePath}/ui/theme", "Theme.kt"),
    )
}