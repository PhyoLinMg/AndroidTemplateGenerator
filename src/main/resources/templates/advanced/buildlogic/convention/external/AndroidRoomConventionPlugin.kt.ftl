import androidx.room.gradle.RoomExtension
import com.google.devtools.ksp.gradle.KspExtension
import ${packageName}.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class AndroidRoomConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            apply(plugin = "androidx.room")
            apply(plugin = "com.google.devtools.ksp")

            <#if pluginList?seq_contains("ksp")>
            extensions.configure<KspExtension> {
                arg("room.generateKotlin", "true")
            }
            </#if>

            extensions.configure<RoomExtension> {
                // The schemas directory contains a schema file for each version of the Room database.
                // This is required to enable Room auto migrations.
                // See https://developer.android.com/reference/kotlin/androidx/room/AutoMigration.
                schemaDirectory("$projectDir/schemas")
            }

            dependencies {
                "implementation"(libs.findLibrary("room.runtime").get())
                "implementation"(libs.findLibrary("room.ktx").get())
                <#if pluginList?seq_contains("ksp")>
                "ksp"(libs.findLibrary("room.compiler").get())
                <#else>
                "kapt"(libs.findLibrary("room.compiler").get())
                </#if>
            }
        }
    }
}
