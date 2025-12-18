plugins {
    alias(libs.plugins.advanced.library)
    <#if dependencyList?seq_contains("hilt")>
    alias(libs.plugins.advanced.hilt)
    </#if>
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.advanced.compose)
}

android {
    namespace = "${packageName}.core.navigation"
}

dependencies {
    api(libs.androidx.navigation.compose)
    implementation(libs.androidx.lifecycle.runtimeCompose)
    implementation(libs.androidx.hilt.navigation.compose)
}
