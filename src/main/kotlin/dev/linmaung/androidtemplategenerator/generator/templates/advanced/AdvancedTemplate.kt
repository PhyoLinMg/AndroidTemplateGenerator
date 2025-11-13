package dev.linmaung.androidtemplategenerator.generator.templates.advanced

import dev.linmaung.androidtemplategenerator.generator.templates.GenericPath

object AdvancedTemplate {

    val advancedTemplate= listOf(

        // App Build Module
        GenericPath("advanced/app/build.gradle.kts.ftl", "app", "build.gradle.kts"),
        GenericPath("advanced/app/main/AndroidManifest.xml.ftl", "app/src/main", "AndroidManifest.xml"),
        GenericPath("advanced/app/main/MainActivity.kt.ftl", "app/src/main/java/{packagePath}", "MainActivity.kt"),
        GenericPath("advanced/app/main/Application.kt.ftl","app/src/main/java/{packagePath}","Application.kt"),
        GenericPath("advanced/app/main/navigation/AppNavHost.kt.ftl","app/src/main/java/{packagePath}/navigation","AppNavHost.kt"),


        // Build Logic Module
        GenericPath("advanced/buildlogic/convention/external/AndroidApplicationComposeConventionPlugin.kt.ftl","build-logic/convention/src/main/kotlin","AndroidApplicationComposeConventionPlugin.kt"),
        GenericPath("advanced/buildlogic/convention/external/AndroidApplicationConventionPlugin.kt.ftl","build-logic/convention/src/main/kotlin","AndroidApplicationConventionPlugin.kt"),
        GenericPath("advanced/buildlogic/convention/external/AndroidRoomConventionPlugin.kt.ftl","build-logic/convention/src/main/kotlin","AndroidRoomConventionPlugin.kt"),
        GenericPath("advanced/buildlogic/convention/external/HiltConventionPlugin.kt.ftl","build-logic/convention/src/main/kotlin","HiltConventionPlugin.kt"),
        GenericPath("advanced/buildlogic/convention/external/AndroidFeatureConventionPlugin.kt.ftl","build-logic/convention/src/main/kotlin","AndroidFeatureConventionPlugin.kt"),
        GenericPath("advanced/buildlogic/convention/external/AndroidApplicationFlavorPlugin.kt.ftl","build-logic/convention/src/main/kotlin","AndroidApplicationFlavorPlugin.kt"),
        GenericPath("advanced/buildlogic/convention/source/AndroidCompose.kt.ftl","build-logic/src/main/kotlin/{packagePath}","AndroidCompose.kt"),
        GenericPath("advanced/buildlogic/convention/source/BuildType.kt.ftl","build-logic/src/main/kotlin/{packagePath}","BuildType.kt"),
        GenericPath("advanced/buildlogic/convention/source/Flavor.kt.ftl","build-logic/src/main/kotlin/{packagePath}","Flavor.kt"),
        GenericPath("advanced/buildlogic/convention/source/KotlinAndroid.kt.ftl","build-logic/src/main/kotlin/{packagePath}","KotlinAndroid.kt"),
        GenericPath("advanced/buildlogic/convention/source/ProjectExtension.kt.ftl","build-logic/src/main/kotlin/{packagePath}","ProjectExtension.kt"),
        GenericPath("advanced/buildlogic/convention/build.gradle.kts.ftl","build-logic/convention","build.gradle.kts"),
        GenericPath("advanced/buildlogic/settings.gradle.kts.ftl", "build-logic","settings.gradle.kts"),
        GenericPath("advanced/buildlogic/gradle.properties", "build-logic","gradle.properties"),

        // Core Database
        GenericPath("advanced/core/database/.gitignore.ftl", "core/database", ".gitignore"),
        GenericPath("advanced/core/database/build.gradle.kts.ftl", "core/database", "build.gradle.kts"),

        // Core Network
        GenericPath("advanced/core/network/.gitignore.ftl", "core/network", ".gitignore"),
        GenericPath("advanced/core/network/build.gradle.kts.ftl", "core/network", "build.gradle.kts"),

        // Core UI
        GenericPath("advanced/core/ui/.gitignore.ftl", "core/ui", ".gitignore.ftl"),
        GenericPath("advanced/core/ui/build.gradle.kts.ftl", "core/ui", "build.gradle.kts"),

        // Feature Home presentation
        GenericPath("advanced/features/home/presentation/HomeViewModel.kt.ftl","features/home/src/main/java/{packagePath}","HomeViewModel.kt"),
        GenericPath("advanced/features/home/presentation/HomeScreen.kt.ftl","features/home/presentation/src/main/java/{packagePath}","HomeScreen.kt"),
        GenericPath("advanced/features/home/presentation/HomeNavigation.kt.ftl","features/home/presentation/src/main/java/{packagePath}","HomeNavigation.kt"),
        GenericPath("advanced/features/home/presentation/build.gradle.kts.ftl", "features/home/presentation", "build.gradle.kts"),
        GenericPath("advanced/features/home/presentation/.gitignore.ftl", "features/home/presentation", ".gitignore.ftl"),

        // Feature Home Data
        GenericPath("advanced/features/home/data/build.gradle.kts.ftl", "features/home/data", "build.gradle.kts"),
        GenericPath("advanced/features/home/data/.gitignore.ftl", "features/home/data", ".gitignore.ftl"),


        // Feature Home Domain
        GenericPath("advanced/features/home/domain/build.gradle.kts.ftl", "features/home/domain", "build.gradle.kts"),
        GenericPath("advanced/features/home/domain/.gitignore.ftl", "features/home/domain", ".gitignore.ftl"),
    )
}