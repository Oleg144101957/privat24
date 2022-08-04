package com.vishnevskiypro.retrofitpractice2.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vishnevskiypro.retrofitpractice2.data.repository.Repository
import com.vishnevskiypro.retrofitpractice2.model.beznal.Beznalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel : ViewModel(){

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Beznalichka>> = MutableLiveData()

    fun getBeznalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getBeznal()
        }
    }


}