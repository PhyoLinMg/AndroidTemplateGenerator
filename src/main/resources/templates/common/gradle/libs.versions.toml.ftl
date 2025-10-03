[versions]
agp = "8.13.0"
kotlin = "2.2.20"
coreKtx = "1.17.0"
junit = "4.13.2"
junitVersion = "1.3.0"
espressoCore = "3.7.0"
lifecycleRuntimeKtx = "2.9.4"
activityCompose = "1.11.0"
composeBom = "2024.09.00"

<#if dependencyInjectionType=="Hilt">
${versions.hilt.key} = "${versions.hilt.version}"
${versions.hiltx.key} = "${versions.hiltx.version}"
<#else>
${versions.koin.key} = "${versions.koin.version}"
</#if>

<#if networkClientType=="Retrofit">
${versions.retrofit.key} = "${versions.retrofit.version}"
${versions.okhttp.key} = "${versions.okhttp.version}"
<#else>
${versions.ktor.key} = "${versions.ktor.version}"
</#if>

<#if compileTime=="KSP">
${versions.ksp.key} = "${versions.ksp.version}"
</#if>

${versions.coroutines.key} = "${versions.coroutines.version}"
${versions.lifecycle.key} = "${versions.lifecycle.version}"

[libraries]
androidx-core-ktx = { group = "androidx.core", name = "core-ktx", version.ref = "coreKtx" }
junit = { group = "junit", name = "junit", version.ref = "junit" }
androidx-junit = { group = "androidx.test.ext", name = "junit", version.ref = "junitVersion" }
androidx-espresso-core = { group = "androidx.test.espresso", name = "espresso-core", version.ref = "espressoCore" }
androidx-lifecycle-runtime-ktx = { group = "androidx.lifecycle", name = "lifecycle-runtime-ktx", version.ref = "lifecycleRuntimeKtx" }
androidx-activity-compose = { group = "androidx.activity", name = "activity-compose", version.ref = "activityCompose" }
androidx-compose-bom = { group = "androidx.compose", name = "compose-bom", version.ref = "composeBom" }
androidx-compose-ui = { group = "androidx.compose.ui", name = "ui" }
androidx-compose-ui-graphics = { group = "androidx.compose.ui", name = "ui-graphics" }
androidx-compose-ui-tooling = { group = "androidx.compose.ui", name = "ui-tooling" }
androidx-compose-ui-tooling-preview = { group = "androidx.compose.ui", name = "ui-tooling-preview" }
androidx-compose-ui-test-manifest = { group = "androidx.compose.ui", name = "ui-test-manifest" }
androidx-compose-ui-test-junit4 = { group = "androidx.compose.ui", name = "ui-test-junit4" }
androidx-compose-material3 = { group = "androidx.compose.material3", name = "material3" }

# Hilt Dependencies
<#if dependencyInjectionType=="Hilt">
<#list dependencies["hilt"] as dep>
${dep.name} = { module="${dep.library.module}", version.ref="${dep.version.key}" }
</#list>
<#else>
# Koin Dependencies
<#list dependencies["koin"] as dep>
${dep.name} = { module="${dep.library.module}", version.ref="${dep.version.key}" }
</#list>
</#if>

<#if networkClientType=="Retrofit">
# Retrofit Dependencies
<#list dependencies["retrofit"] as dep>
${dep.name} = { module="${dep.library.module}", version.ref="${dep.version.key}" }
</#list>
<#else>
# Ktor Dependencies
<#list dependencies["ktor"] as dep>
${dep.name} = { module="${dep.library.module}", version.ref="${dep.version.key}" }
</#list>
</#if>

# Coroutines Dependencies
<#list dependencies["coroutines"] as dep>
${dep.name} = { module="${dep.library.module}", version.ref="${dep.version.key}" }
</#list>


# Lifecycle Dependencies
<#list dependencies["viewmodel"] as dep>
${dep.name} = { module="${dep.library.module}", version.ref="${dep.version.key}" }
</#list>

[plugins]
android-application = { id = "com.android.application", version.ref = "agp" }
kotlin-android = { id = "org.jetbrains.kotlin.android", version.ref = "kotlin" }
kotlin-compose = { id = "org.jetbrains.kotlin.plugin.compose", version.ref = "kotlin" }

<#if dependencyInjectionType=="Hilt">
${plugins["hilt"].key} = { id="${plugins.hilt.id}", version.ref="${plugins.hilt.version.key}" }
</#if>
<#if compileTime=="KSP">
${plugins["ksp"].key} = { id="${plugins.ksp.id}", version.ref="${plugins.ksp.version.key}" }
<#else>
${plugins["kapt"].key} = { id="${plugins.kapt.id}", version.ref="${plugins.kapt.version.key}" }
</#if>

