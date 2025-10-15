plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false

    <#if pluginList?seq_contains("ksp")>
    alias(libs.plugins.ksp) apply false
    <#else>
    alias(libs.plugins.kapt) apply false
    </#if>

    <#if pluginList?seq_contains("hilt")>
    alias(libs.plugins.hilt) apply false
    </#if>

    alias(libs.plugins.library) apply false
    alias(libs.plugins.jetbrains.kotlin.jvm) apply false

}