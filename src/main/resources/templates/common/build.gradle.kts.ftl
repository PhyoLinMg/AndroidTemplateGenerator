plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false

    <#if model.compileTime=="KSP">
    alias(libs.plugins.ksp) apply false
    <#else>
    alias(libs.plugins.kapt) apply false
    </#if>
}