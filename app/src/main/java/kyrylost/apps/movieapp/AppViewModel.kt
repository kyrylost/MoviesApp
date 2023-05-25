package kyrylost.apps.movieapp

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kyrylost.apps.movieapp.api.ApiRepository

class AppViewModel : ViewModel() {

    fun apiTest(page: Int) {
        CoroutineScope(Dispatchers.IO).launch {
            val response = ApiRepository().getMovies(1)
            response.body().let { moviesList ->
                Log.d("apitestQQQ", moviesList.toString())
                if (moviesList != null) {
                    for (movie in moviesList) {
                        Log.d("apitest", movie.toString())
                    }
                }
            }
        }
    }

}