package com.vishnevskiypro.retrofitpractice2.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vishnevskiypro.retrofitpractice2.data.repository.Repository
import com.vishnevskiypro.retrofitpractice2.model.nal.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel : ViewModel() {


    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Nalichka>> = MutableLiveData()

    fun getNalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getNal()
        }
    }

}