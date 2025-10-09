package ${packageName}

import android.app.Application

<#if dependencyList?seq_contains("timber")>
import timber.log.Timber
</#if>

<#if dependencyList?seq_contains("koin")>
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
<#elseif dependencyList?seq_contains("hilt")>
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
</#if>
class ${projectName}Application: Application(){
    override fun onCreate() {
        super.onCreate()

        <#if dependencyList?seq_contains("koin")>
        startKoin {
            androidLogger()
            androidContext(this@${projectName}Application)
            //load your modules
        }
        </#if>

        <#if dependencyList?seq_contains("timber")>
        // Initialize Timber
        if(BuildConfig.DEBUG){
             Timber.plant(Timber.DebugTree())
        }
        </#if>
    }


}