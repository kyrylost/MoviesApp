package kyrylost.apps.movieapp.api

import kyrylost.apps.movieapp.model.MoviesList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @Headers("api_key: e60f20b82d75e0fafc5e55954189d850")
    @GET("/3/movie/550")
    suspend fun getMovies(@Query("page") page: Int): Response<MoviesList>
}