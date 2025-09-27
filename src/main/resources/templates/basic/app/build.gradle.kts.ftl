plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "${packageName}"
    compileSdk = 34
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")

    <#if useRetrofit?? && useRetrofit>
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    </#if>

    <#if useKtor?? && useKtor>
    implementation("io.ktor:ktor-client-android:2.0.0")
    </#if>

    <#if useCoroutines?? && useCoroutines>
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    </#if>
}
