package dev.linmaung.androidtemplategenerator.generator.templates

object CommonTemplate {
   val commonTemplate= listOf(
       GenericPath("common/.gitignore.ftl", ""),
       GenericPath("common/.gitignore.ftl", "app", ".gitignore"),
       GenericPath("common/gradle.properties.ftl", ""),
       GenericPath("common/gradle/libs.versions.toml.ftl","gradle"),
       GenericPath("common/gradle/wrapper/gradle-wrapper.jar", "gradle/wrapper", "gradle-wrapper.jar"),
       GenericPath("common/gradle/wrapper/gradle-wrapper.properties.ftl", "gradle/wrapper", "gradle-wrapper.properties"),

       GenericPath("common/AndroidManifest.xml.ftl", "app/src/main"),
       GenericPath("common/gradlew.ftl",""),
       GenericPath("common/gradlew.bat.ftl",""),
       GenericPath("common/local.properties.ftl",""),
       GenericPath("common/settings.gradle.kts.ftl", ""),
       GenericPath("common/build.gradle.kts.ftl", ""),
   )
}