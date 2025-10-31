import com.android.build.gradle.api.AndroidBasePlugin
import ${packageName}.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.dependencies

class HiltConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            <#if pluginList?seq_contains("ksp")>
            apply(plugin = "com.google.devtools.ksp")
            <#elseif pluginList?seq_contains("kapt")>
            apply(plugin = "org.jetbrains.kotlin.kapt")
            </#if>

            dependencies {
                <#if pluginList?seq_contains("ksp")>
                "ksp"(libs.findLibrary("hilt.compiler").get())
                <#elseif pluginList?seq_contains("kapt")>
                "kapt"(libs.findLibrary("hilt.compiler").get())
                </#if>
            }

            // Add support for Jvm Module, base on org.jetbrains.kotlin.jvm
            pluginManager.withPlugin("org.jetbrains.kotlin.jvm") {
                dependencies {
                    "implementation"(libs.findLibrary("hilt.core").get())
                }
            }

            /** Add support for Android modules, based on [AndroidBasePlugin] */
            pluginManager.withPlugin("com.android.base") {
                apply(plugin = "dagger.hilt.android.plugin")
                dependencies {
                    "implementation"(libs.findLibrary("hilt.android").get())
                    "implementation"(libs.findLibrary("hilt.nav.fragment").get())
                    "implementation"(libs.findLibrary("hilt.nav.compose").get())
                }
            }
        }
    }
}
