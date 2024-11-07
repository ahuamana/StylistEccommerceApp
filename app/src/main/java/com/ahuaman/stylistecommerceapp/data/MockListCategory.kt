package com.ahuaman.stylistecommerceapp.data

import com.ahuaman.stylistecommerceapp.R
import com.ahuaman.stylistecommerceapp.domain.ItemCategory

object MockListCategory {

    fun listCategory() = listOf(
        ItemCategory(1, "Adidas", R.drawable.adidas),
        ItemCategory(2, "Nike", R.drawable.nike),
        ItemCategory(3, "Puma", R.drawable.ic_puma),
        ItemCategory(4, "Fila", R.drawable.fila)
    )
}