package kyrylost.apps.movieapp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}