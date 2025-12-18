import ${packageName}.BuildType

plugins {
    alias(libs.plugins.advanced.application)
    alias(libs.plugins.advanced.flavors)
    alias(libs.plugins.advanced.compose)
    <#if dependencyList?seq_contains("hilt")>
    alias(libs.plugins.advanced.hilt)
    </#if>

    alias(libs.plugins.kotlin.serialization)
}

android {
    defaultConfig {
        applicationId = "${packageName}"
        versionCode = 8
        versionName = "0.0.1" // X.Y.Z; X = Major, Y = minor, Z = Patch level

    }

    buildTypes {
        debug {
            applicationIdSuffix = BuildType.DEBUG.applicationIdSuffix
        }
        release {
            isMinifyEnabled = providers.gradleProperty("minifyWithR8")
                .map(String::toBooleanStrict).getOrElse(true)
            applicationIdSuffix = NiaBuildType.RELEASE.applicationIdSuffix
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),
                          "proguard-rules.pro")

            // To publish on the Play store a private signing key is required, but to allow anyone
            // who clones the code to sign and run the release variant, use the debug signing key.
            // TODO: Abstract the signing configuration to a separate file to avoid hardcoding this.
            signingConfig = signingConfigs.named("debug").get()
            // Ensure Baseline Profile is fresh for release builds.
            baselineProfile.automaticGenerationDuringBuild = true
        }
    }

    packaging {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
    testOptions.unitTests.isIncludeAndroidResources = true
    namespace = "${packageName}"
}

dependencies {
    implementation(projects.core.database)
    implementation(projects.core.network)
    implementation(projects.core.navigation)
    implementation(projects.core.ui)


    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)



    implementation(libs.androidx.compose.runtime.tracing)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.androidx.hilt.navigation.compose)
    implementation(libs.androidx.lifecycle.runtimeCompose)
    implementation(libs.androidx.navigation.compose)



    implementation(libs.kotlinx.coroutines.guava)
    implementation(libs.coil.kt)
    implementation(libs.kotlinx.serialization.json)

    ksp(libs.hilt.compiler)

    debugImplementation(libs.androidx.compose.ui.testManifest)
    debugImplementation(projects.uiTestHiltManifest)

    kspTest(libs.hilt.compiler)
}
