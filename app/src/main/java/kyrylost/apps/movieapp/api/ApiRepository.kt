package kyrylost.apps.movieapp.api

import kyrylost.apps.movieapp.model.MoviesList
import retrofit2.Response

class ApiRepository {
    suspend fun getMovies(page: Int): Response<MoviesList> {
        return ApiInstance.api.getMovies(page)
    }
}