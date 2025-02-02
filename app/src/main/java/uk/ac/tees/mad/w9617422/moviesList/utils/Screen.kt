package uk.ac.tees.mad.w9617422.moviesList.utils

sealed class Screen(val rout: String) {
    object Home : Screen("main")
    object PopularMovieList : Screen("popularMovie")
    object UpcomingMovieList : Screen("upcomingMovie")
    object ProfileScreen : Screen("profileScreen")
    object BookmarkScreen : Screen("bookmarkScreen")
    object Details : Screen("details")
}