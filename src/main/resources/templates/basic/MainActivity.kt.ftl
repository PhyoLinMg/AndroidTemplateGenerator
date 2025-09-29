package ${packageName}

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import ${packageName}.ui.theme.${projectName}Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        <#if useCompose?? && useCompose>
        setContent {
            ${projectName}Theme{
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyApp(Modifier.padding(innerPadding))
                }
            }
        }
        <#else>
        setContentView(R.layout.activity_main)
        </#if>
    }
}

<#if useCompose?? && useCompose>
@Composable
fun MyApp(modifier: Modifier= Modifier) {
    Text("Hello from ${projectName}!", modifier= modifier)
}
</#if>
