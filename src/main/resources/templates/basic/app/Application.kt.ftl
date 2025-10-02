package ${packageName}

import android.app.Application
<#if dependencyInjectionType== "Hilt">
import org.koin.android.ext.koin.androidContext
<#else>
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
</#if>

<#if dependencyInjectionType== "Hilt">
@HiltAndroidApp
</#if>
class ${projectName}Application: Application(){
    override fun onCreate() {
        super.onCreate()

        <#if dependencyInjectionType== "Koin">
        startKoin {
            androidLogger()
            androidContext(this@BasicTemplateApplication)
            //load your modules
        }
        </#if>
    }


}