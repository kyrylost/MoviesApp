package kyrylost.apps.movieapp.model

import com.google.gson.annotations.SerializedName

data class Movie(
    val adult: Boolean? = null,
    @SerializedName("backdrop_path")
    val backdropPath: String? = null,
    val id: Int? = null,
    val title: String? = null,
    @SerializedName("original_language")
    val originalLanguage : String? = null,
    @SerializedName("original_title")
    val originalTitle: String? = null,
    val overview: String? = null,
    @SerializedName("poster_path")
    val posterPath: String? = null,
    @SerializedName("media_type")
    val mediaType: String? = null,
    @SerializedName("genre_ids")
    val genreIds: ArrayList<Int> = arrayListOf(),
    val popularity: Double? = null,
    @SerializedName("release_date")
    val releaseDate: String? = null,
    val video: Boolean? = null,
    @SerializedName("vote_average")
    val voteAverage: Double? = null,
    @SerializedName("vote_count")
    val voteCount: Int? = null
)
