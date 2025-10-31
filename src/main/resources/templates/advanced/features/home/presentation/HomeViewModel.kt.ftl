package ${packageName}.features.home.presentation


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
<#if dependencyList?.seq_contains("hilt")>
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
</#if>
class HomeViewModel: ViewModel(){

}