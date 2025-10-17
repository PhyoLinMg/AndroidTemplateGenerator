package dev.linmaung.androidtemplategenerator.generator.templates.interemediate

import dev.linmaung.androidtemplategenerator.generator.templates.GenericPath

object IntermediateTemplate {
    val intermediateTemplate = listOf(
        // App Module files
        GenericPath("intermediate/app/build.gradle.kts.ftl", "app", "build.gradle.kts"),
        GenericPath("intermediate/app/Application.kt.ftl", "app/src/main/java/{packagePath}", "Application.kt"),
        GenericPath("intermediate/app/AndroidManifest.xml.ftl", "app/src/main", "AndroidManifest.xml"),
        GenericPath("intermediate/app/AppNavHost.kt.ftl", "app/src/main/java/{packagePath}/navigation", "AppNavHost.kt"),
        GenericPath("intermediate/app/MainActivity.kt.ftl", "app/src/main/java/{packagePath}"),


        //Core Module files
        GenericPath("intermediate/core/ui/Theme.kt.ftl", "core/src/main/java/{packagePath}.core/ui", "Theme.kt"),
        GenericPath("intermediate/core/ui/Typography.kt.ftl", "core/src/main/java/{packagePath}.core/ui", "Typography.kt"),

        GenericPath("intermediate/core/network/ApiService.kt.ftl", "core/src/main/java/{packagePath}.core/network", "ApiService.kt"),
        GenericPath("intermediate/core/network/NetworkResult.kt.ftl", "core/src/main/java/{packagePath}.core/network", "NetworkResult.kt"),
        GenericPath("intermediate/core/utils/UiText.kt.ftl", "core/src/main/java/{packagePath}.core/utils", "UiText.kt"),
        GenericPath("intermediate/core/AndroidManifest.xml.ftl", "core/src/main", "AndroidManifest.xml"),
        GenericPath("intermediate/core/build.gradle.kts.ftl", "core", "build.gradle.kts"),

        // Domain Module files
        GenericPath("intermediate/domain/repository/ExampleRepository.kt.ftl", "domain/src/main/java/{packagePath}.domain/repository", "ExampleRepository.kt"),
        GenericPath("intermediate/domain/model/Model.kt.ftl", "domain/src/main/java/{packagePath}.domain/model", "Model.kt"),
        GenericPath("intermediate/domain/build.gradle.kts.ftl", "domain", "build.gradle.kts"),

        // Data Module files

        GenericPath("intermediate/data/repository/ExampleRepositoryImpl.kt.ftl", "data/src/main/java/{packagePath}.data/repository", "ExampleRepositoryImpl.kt"),
        GenericPath("intermediate/data/remote/RemoteDataSource.kt.ftl", "data/src/main/java/{packagePath}.data/remote", "RemoteDataSource.kt"),
        GenericPath("intermediate/data/dto/LocalEntity.kt.ftl", "data/src/main/java/{packagePath}.data/dto/local", "LocalEntity.kt"),
        GenericPath("intermediate/data/dto/RemoteDto.kt.ftl", "data/src/main/java/{packagePath}.data/dto/remote", "RemoteResponse.kt"),
        GenericPath("intermediate/data/local/LocalDao.kt.ftl", "data/src/main/java/{packagePath}.data/local/dao", "LocalDao.kt"),
        GenericPath("intermediate/data/local/LocalDatabase.kt.ftl", "data/src/main/java/{packagePath}.data/local", "LocalDatabase.kt"),
        GenericPath("intermediate/data/AndroidManifest.xml.ftl", "data/src/main"),
        GenericPath("intermediate/data/build.gradle.kts.ftl", "data", "build.gradle.kts"),

        // Feature Module Files
        GenericPath("intermediate/feature/home/navigation/HomeNavGraph.kt.ftl", "feature/home/src/main/java/{packagePath}.feature/home/navigation", "HomeNavGraph.kt"),
        GenericPath("intermediate/feature/home/presentation/HomeScreen.kt.ftl", "feature/home/src/main/java/{packagePath}.feature/home/presentation", "HomeScreen.kt"),
        GenericPath("intermediate/feature/home/presentation/HomeViewModel.kt.ftl", "feature/home/src/main/java/{packagePath}.feature/home/presentation", "HomeViewModel.kt"),
        GenericPath("intermediate/feature/home/AndroidManifest.xml.ftl", "feature/home/src/main", "AndroidManifest.xml"),
        GenericPath("intermediate/feature/home/build.gradle.kts.ftl", "feature/home", "build.gradle.kts"),
    )
}