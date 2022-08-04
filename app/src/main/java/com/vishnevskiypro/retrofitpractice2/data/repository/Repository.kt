package com.vishnevskiypro.retrofitpractice2.data.repository

import com.vishnevskiypro.retrofitpractice2.data.api.RetrofitInstance
import com.vishnevskiypro.retrofitpractice2.model.beznal.Beznalichka
import com.vishnevskiypro.retrofitpractice2.model.beznal.BeznalichkaItem
import com.vishnevskiypro.retrofitpractice2.model.nal.Nalichka
import com.vishnevskiypro.retrofitpractice2.model.nal.NalichkaItem
import retrofit2.Response

class Repository {

    suspend fun getNal(): Response<Nalichka>{
        return RetrofitInstance.api.getNalMoneys()
    }

    suspend fun getBeznal(): Response<Beznalichka>{
        return RetrofitInstance.api.getBeznalMoneys()
    }

}