package com.ahuaman.stylistecommerceapp.data

import com.ahuaman.stylistecommerceapp.R
import com.ahuaman.stylistecommerceapp.domain.ItemShop

object MockListItemShop {

    fun getDefaultList() : List<ItemShop> {
        return listOf(
            ItemShop(1, "Nike Sportswear Club Fleece", 99.0, R.drawable.ic_one_shop),
            ItemShop(2, "Trail Running Jacket Nike Windrunner", 80.0, R.drawable.ic_shop_two),
            ItemShop(3, "Nike Sportswear Club Fleece", 20.0, R.drawable.ic_shop_three),
            ItemShop(4, "Nike Sportswear Club Fleece", 15.0, R.drawable.ic_shop_four),
        )
    }
}