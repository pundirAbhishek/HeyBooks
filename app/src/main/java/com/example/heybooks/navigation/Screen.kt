package com.example.heybooks.navigation

import androidx.annotation.StringRes
import com.example.heybooks.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object BookList : Screen("book_list", R.string.screen_book_list)
    object BookDetails : Screen("book_details", R.string.screen_book_details)
}
