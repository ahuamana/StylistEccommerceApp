package com.ahuaman.stylistecommerceapp.domain

data class ItemShop(
    val id: Int,
    val title: String,
    val price: Double,
    val image: Int,
    val isFavorite: Boolean = false
)
