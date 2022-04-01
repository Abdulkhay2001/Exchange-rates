package com.abdul.exchangerates.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abdul.exchangerates.data.repository.Repository
import com.abdul.exchangerates.model.beznal.Beznal
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel :ViewModel() {
    val repo = Repository()
    val myMoneyList: MutableLiveData<Response<Beznal>> = MutableLiveData()

    fun getBeznal(){
        viewModelScope.launch {
            myMoneyList.value = repo.getBeznal()
        }
    }
}