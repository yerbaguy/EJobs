package com.ebartmedia.Retrofit

import com.ebartmedia.Model.Categories
import io.reactivex.Observable
import retrofit2.http.GET

interface IMyAPI {


    @get:GET("api/categories")
    val categories: Observable<List<Categories>>
}
