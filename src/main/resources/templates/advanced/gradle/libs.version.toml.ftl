[versions]
accompanist = "0.37.0"
androidDesugarJdkLibs = "2.1.4"
# AGP and tools should be updated together
androidGradlePlugin = "8.13.1"
androidTools = "31.13.1"
androidxActivity = "1.9.3"
androidxAppCompat = "1.7.0"
androidxBrowser = "1.8.0"






androidxCoreSplashscreen = "1.0.1"


androidxHiltLifecycleViewModelCompose = "1.3.0-alpha02"
androidxLifecycle = "2.10.0"
androidxLintGradle = "1.0.0-alpha03"
androidxLifecycleViewModelNavigation3 = "2.10.0"


androidxNavigation = "2.8.5"
androidxNavigation3 = "1.0.0"

androidxSavedStateCompose = "1.3.1"
androidxWindowManager = "1.3.0"

<#assign uniqueMap = {}>
<#list dependencyList + pluginList as item>
  <#assign uniqueMap = uniqueMap + {item: true}>
</#list>

<#-- Extract keys as the merged unique list -->
<#assign mergedList = uniqueMap?keys>

<#list mergedList as depKey>
<#if versions[depKey]??>
<#list versions[depKey] as ver>
${ver.key} = "${ver.version}"
</#list>
</#if>
</#list>

androidxWork = "2.10.0"
coil = "2.7.0"
gmsPlugin = "4.4.4"
kotlin = "2.2.21"


[libraries]
<#list dependencyList as depKey>
  <#if dependencies[depKey]??>
# ${depKey?cap_first} Dependencies
    <#list dependencies[depKey] as dep>
${dep.name} = { module="${dep.library.module}", version.ref="${dep.version.key}" }
    </#list>
  </#if>
</#list>

androidx-compose-bom = { group = "androidx.compose", name = "compose-bom-alpha", version.ref = "androidxComposeBom" }
androidx-compose-foundation = { group = "androidx.compose.foundation", name = "foundation", version.ref = "androidxComposeFoundation" }
androidx-compose-foundation-layout = { group = "androidx.compose.foundation", name = "foundation-layout" }
androidx-compose-material-iconsExtended = { group = "androidx.compose.material", name = "material-icons-extended" }
androidx-compose-material3 = { group = "androidx.compose.material3", name = "material3" }
androidx-compose-material3-navigationSuite = { group = "androidx.compose.material3", name = "material3-adaptive-navigation-suite" }
androidx-compose-material3-adaptive = { group = "androidx.compose.material3.adaptive", name = "adaptive", version.ref = "androidxComposeMaterial3Adaptive" }
androidx-compose-material3-adaptive-layout = { group = "androidx.compose.material3.adaptive", name = "adaptive-layout", version.ref = "androidxComposeMaterial3Adaptive" }
androidx-compose-material3-adaptive-navigation = { group = "androidx.compose.material3.adaptive", name = "adaptive-navigation", version.ref = "androidxComposeMaterial3Adaptive" }
androidx-compose-material3-adaptive-navigation3 = { group = "androidx.compose.material3.adaptive", name = "adaptive-navigation3",version.ref="androidxComposeMaterial3AdaptiveNavigation3" }
androidx-compose-material3-windowSizeClass = { group = "androidx.compose.material3", name = "material3-window-size-class" }
androidx-compose-runtime = { group = "androidx.compose.runtime", name = "runtime" }
androidx-compose-runtime-tracing = { group = "androidx.compose.runtime", name = "runtime-tracing", version.ref = "androidxComposeRuntimeTracing" }
androidx-compose-ui-test = { group = "androidx.compose.ui", name = "ui-test-junit4" }
androidx-compose-ui-testManifest = { group = "androidx.compose.ui", name = "ui-test-manifest" }
androidx-compose-ui-tooling = { group = "androidx.compose.ui", name = "ui-tooling" }
androidx-compose-ui-tooling-preview = { group = "androidx.compose.ui", name = "ui-tooling-preview" }
androidx-compose-ui-util = { group = "androidx.compose.ui", name = "ui-util" }
androidx-core-ktx = { group = "androidx.core", name = "core-ktx", version.ref = "androidxCore" }
androidx-core-splashscreen = { group = "androidx.core", name = "core-splashscreen", version.ref = "androidxCoreSplashscreen" }
androidx-dataStore = { group = "androidx.datastore", name = "datastore", version.ref = "androidxDataStore" }
androidx-dataStore-core = { group = "androidx.datastore", name = "datastore-core", version.ref = "androidxDataStore" }
androidx-hilt-lifecycle-viewModelCompose = { group = "androidx.hilt", name = "hilt-lifecycle-viewmodel-compose", version.ref = "androidxHiltLifecycleViewModelCompose" }
androidx-lifecycle-runtimeCompose = { group = "androidx.lifecycle", name = "lifecycle-runtime-compose", version.ref = "androidxLifecycle" }
androidx-lifecycle-runtimeTesting = { group = "androidx.lifecycle", name = "lifecycle-runtime-testing", version.ref = "androidxLifecycle" }
androidx-lifecycle-viewModelCompose = { group = "androidx.lifecycle", name = "lifecycle-viewmodel-compose", version.ref = "androidxLifecycle" }
androidx-lifecycle-viewModel-testing = { group = "androidx.lifecycle", name = "lifecycle-viewmodel-testing", version.ref = "androidxLifecycle" }
androidx-lifecycle-viewModel-navigation3 = { group = "androidx.lifecycle", name = "lifecycle-viewmodel-navigation3", version.ref = "androidxLifecycleViewModelNavigation3" }
androidx-lint-gradle = { group = "androidx.lint", name = "lint-gradle", version.ref = "androidxLintGradle" }

androidx-navigation-testing = { group = "androidx.navigation", name = "navigation-testing", version.ref = "androidxNavigation" }
androidx-navigation3-runtime = { group = "androidx.navigation3", name = "navigation3-runtime", version.ref = "androidxNavigation3" }
androidx-navigation3-ui = { group = "androidx.navigation3", name = "navigation3-ui", version.ref = "androidxNavigation3" }
androidx-savedstate-compose = { group = "androidx.savedstate", name = "savedstate-compose", version.ref = "androidxSavedStateCompose" }

androidx-window-core = { group = "androidx.window", name = "window-core", version.ref = "androidxWindowManager" }
androidx-work-ktx = { group = "androidx.work", name = "work-runtime-ktx", version.ref = "androidxWork" }
androidx-work-testing = { group = "androidx.work", name = "work-testing", version.ref = "androidxWork" }
coil-kt = { group = "io.coil-kt", name = "coil", version.ref = "coil" }
coil-kt-compose = { group = "io.coil-kt", name = "coil-compose", version.ref = "coil" }
coil-kt-svg = { group = "io.coil-kt", name = "coil-svg", version.ref = "coil" }
kotlin-stdlib = { group = "org.jetbrains.kotlin", name = "kotlin-stdlib-jdk8", version.ref = "kotlin" }

kotlinx-datetime = { group = "org.jetbrains.kotlinx", name = "kotlinx-datetime", version.ref = "kotlinxDatetime" }
kotlinx-serialization-json = { group = "org.jetbrains.kotlinx", name = "kotlinx-serialization-json", version.ref = "kotlinxSerializationJson" }

# Dependencies of the included build-logic
android-gradleApiPlugin = { group = "com.android.tools.build", name = "gradle-api", version.ref = "androidGradlePlugin" }
android-tools-common = { group = "com.android.tools", name = "common", version.ref = "androidTools" }
compose-gradlePlugin = { module = "org.jetbrains.kotlin:compose-compiler-gradle-plugin", version.ref = "kotlin" }
kotlin-gradlePlugin = { group = "org.jetbrains.kotlin", name = "kotlin-gradle-plugin", version.ref = "kotlin" }
ksp-gradlePlugin = { group = "com.google.devtools.ksp", name = "com.google.devtools.ksp.gradle.plugin", version.ref = "ksp" }

[plugins]
android-application = { id = "com.android.application", version.ref = "androidGradlePlugin" }
android-library = { id = "com.android.library", version.ref = "androidGradlePlugin" }
android-lint = { id = "com.android.lint", version.ref = "androidGradlePlugin" }
android-test = { id = "com.android.test", version.ref = "androidGradlePlugin" }
compose = { id = "org.jetbrains.kotlin.plugin.compose", version.ref = "kotlin" }
gms = { id = "com.google.gms.google-services", version.ref = "gmsPlugin" }

kotlin-jvm = { id = "org.jetbrains.kotlin.jvm", version.ref = "kotlin" }
kotlin-serialization = { id = "org.jetbrains.kotlin.plugin.serialization", version.ref = "kotlin" }

<#list pluginList as depKey>
  <#if plugins[depKey]??>
${plugins[depKey].key} = { id="${plugins[depKey].id}", version.ref="${plugins[depKey].version.key}" }
  </#if>
</#list>



# Plugins defined by this project
advanced-android-application = { id = "nowinandroid.android.application" }
advanced-android-application-compose = { id = "nowinandroid.android.application.compose" }
advanced-android-application-flavors = { id = "nowinandroid.android.application.flavors" }
advanced-android-library = { id = "nowinandroid.android.library" }
advanced-android-library-compose = { id = "nowinandroid.android.library.compose" }
advanced-android-library-jacoco = { id = "nowinandroid.android.library.jacoco" }
advanced-android-lint = { id = "nowinandroid.android.lint" }
advanced-android-room = { id = "nowinandroid.android.room" }
advanced-android-test = { id = "nowinandroid.android.test" }
advanced-hilt = { id = "nowinandroid.hilt" }
advanced-jvm-library = { id = "nowinandroid.jvm.library" }
