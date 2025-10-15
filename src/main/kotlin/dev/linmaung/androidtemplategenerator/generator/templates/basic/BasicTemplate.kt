package dev.linmaung.androidtemplategenerator.generator.templates.basic

import dev.linmaung.androidtemplategenerator.generator.templates.GenericPath

object BasicTemplate {
    val basicTemplate= listOf(

        // App directory files
        GenericPath("basic/app/build.gradle.kts.ftl", "app", "build.gradle.kts"),
        GenericPath("basic/app/Application.kt.ftl", "app/src/main/java/{packagePath}", "Application.kt"),

        GenericPath("basic/MainActivity.kt.ftl", "app/src/main/java/{packagePath}"),

        GenericPath("basic/theme/theme.kt.ftl", "app/src/main/java/{packagePath}/ui/theme", "Theme.kt"),
    )
}