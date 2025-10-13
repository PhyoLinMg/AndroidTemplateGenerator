plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)

    <#if dependencyList?seq_contains("ksp")>
    alias(libs.plugins.ksp)
    </#if>
    <#if dependencyList?seq_contains("kapt")>
    alias(libs.plugins.kapt)
    </#if>
}

android{
    compileSdk= 36
    namespace="${packageName}.core"
}
dependencies {

    implementation(project(":domain"))

    <#if dependencyList?seq_contains("room")>

    // Room Dependencies
    <#list dependencies["room"] as dependency>
    ${dependency.toType(${compilerType})}(libs.${dependency.key})
    </#list>
    </#if>

    <#if dependencyList?seq_contains("ktor")>
    //Ktor Dependencies
    <#list dependencies["ktor"] as dependency>
    ${dependency.toType(${compilerType})}(libs.${dependency.key})
    </#list>
    </#if>



    <#if dependencyList?seq_contains("retrofit")>
    //Retrofit Dependencies
    <#list dependencies["ktor"] as dependency>
    ${dependency.toType(${compilerType})}(libs.${dependency.key})
    </#list>
    </#if>

}