plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)

    <#list pluginList as pluginKey>
      <#if plugins[pluginKey]??>
        alias(libs.plugins.${plugins[pluginKey].key})
      </#if>
    </#list>
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
            debug {
                isMinifyEnabled= false
                isShrinkResources= false
            }
            release {
                isMinifyEnabled = true
                isShrinkResources= true
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
        }
        flavorDimensions += "environment"

        productFlavors {
            register("staging"){
                dimension="environment"
                applicationIdSuffix= ".staging"
                versionName ="-staging"
            }
            register("production"){
                dimension= "environment"
                //remove this if you don't want application id suffix
                applicationIdSuffix=".production"
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
        buildConfig = true
    }
}

dependencies {

    implementation(project(":core"))
    implementation(project(":feature:home"))

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

   <#list dependencyList as depKey>
     <#if dependencies[depKey]??>
       // ${depKey?cap_first} dependencies
       <#list dependencies[depKey] as dep>
       ${dep.toType(compilerType)}(libs.${dep.toGradleName()})
       </#list>
     </#if>
   </#list>



}