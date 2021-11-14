package com.example.heybooks.model

import kotlinx.serialization.Serializable

@Serializable
data class BooksItem(
    val authors: List<String>,
    val categories: List<String>,
    val isbn: String,
    val longDescription: String,
    val pageCount: Int,
    val publishedDate: PublishedDate,
    val shortDescription: String,
    val status: String,
    val thumbnailUrl: String,
    val title: String
)