plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)

    <#if dependencyInjectionType=="Hilt">
    alias(libs.plugins.${plugins["hilt"].key})
    </#if>
    <#if compileTime=="KSP">
    alias(libs.plugins.${plugins["ksp"].key})
    <#else>
    alias(libs.plugins.${plugins["kapt"].key})
    </#if>
}

android {
    namespace = "${packageName}"
    compileSdk = 36

    defaultConfig {
        applicationId = "${packageName}"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)

    <#if dependencyInjectionType=="Hilt">
    // Hilt dependencies
    <#list dependencies["hilt"] as dep>
    <#if compileTime=="KSP" && dep.name=="hilt-compiler">
    ${dep.toType(compileTime?lower_case)}(libs.${dep.toGradleName()})
    <#else>
    ${dep.toType("implementation")}(libs.${dep.toGradleName()})
    </#if>
    </#list>
    <#else>
    // Koin dependencies
    <#list dependencies["koin"] as dep>
    ${dep.toType("implementation")}(libs.${dep.toGradleName()})
    </#list>
    </#if>

    <#if networkClientType=="Retrofit">
    // Retrofit dependencies
    <#list dependencies["retrofit"] as dep>
    ${dep.toType("implementation")}(libs.${dep.toGradleName()})
    </#list>
    <#else>
    // Ktor dependencies
    <#list dependencies["ktor"] as dep>
    ${dep.toType("implementation")}(libs.${dep.toGradleName()})
    </#list>
    </#if>

    <#list dependencies["coroutines"] as dep>
    ${dep.toType("implementation")}(libs.${dep.toGradleName()})
    </#list>


    <#list dependencies["viewmodel"] as dep>
    ${dep.toType("implementation")}(libs.${dep.toGradleName()})
    </#list>



}