package ${packageName}

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        <#if useCompose?? && useCompose>
        setContent {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                MyApp()
            }
        }
        <#else>
        setContentView(R.layout.activity_main)
        </#if>
    }
}

<#if useCompose?? && useCompose>
@Composable
fun MyApp() {
    Text("Hello from ${projectName}!")
}
</#if>
