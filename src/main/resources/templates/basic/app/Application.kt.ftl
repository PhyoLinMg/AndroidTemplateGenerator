package ${packageName}

import android.app.Application
<#if dependencyInjectionType== "Koin">
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
<#else>
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
</#if>
class ${projectName}Application: Application(){
    override fun onCreate() {
        super.onCreate()

        <#if dependencyInjectionType== "Koin">
        startKoin {
            androidLogger()
            androidContext(this@${projectName}Application)
            //load your modules
        }
        </#if>
    }


}