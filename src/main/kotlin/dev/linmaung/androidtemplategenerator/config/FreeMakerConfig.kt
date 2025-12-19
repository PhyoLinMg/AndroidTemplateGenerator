package dev.linmaung.androidtemplategenerator.config

import dev.linmaung.androidtemplategenerator.service.ProjectGenerator
import freemarker.template.Configuration
import freemarker.template.TemplateExceptionHandler
import org.springframework.context.annotation.Bean

@org.springframework.context.annotation.Configuration
class FreeMakerConfig {
    @Bean
    fun freemarkerConfig(): Configuration {
        return Configuration(Configuration.VERSION_2_3_31).apply {
            setClassLoaderForTemplateLoading(this.javaClass.classLoader, "templates")
            defaultEncoding = "UTF-8"
            templateExceptionHandler = TemplateExceptionHandler.RETHROW_HANDLER
            logTemplateExceptions = false
            wrapUncheckedExceptions = true
        }
    }

    @Bean
    fun projectGenerator(freemarkerConfig: Configuration): ProjectGenerator {
        return ProjectGenerator(freemarkerConfig) // Adjust constructor as needed
    }
}