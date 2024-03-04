package com.example.cityapp.data

import com.example.cityapp.R
import com.example.cityapp.model.Recommendation

object LocalRecommendationDataProvider {
    val recommendations: List<Recommendation> = listOf(
        Recommendation(
            id = 1,
            name = R.string.coffee_shop_name_1,
            category = R.string.category_name_1,
            address = R.string.coffee_shop_address_1,
            description = R.string.coffee_shop_desc_1,
            imageResourceId = R.drawable.jo
        ),
        Recommendation(
            id = 2,
            name = R.string.coffee_shop_name_2,
            category = R.string.category_name_1,
            address = R.string.coffee_shop_address_2,
            description = R.string.coffee_shop_desc_2,
            imageResourceId = R.drawable.endi
        ),
        Recommendation(
            id = 3,
            name = R.string.coffee_shop_name_3,
            category = R.string.category_name_1,
            address = R.string.coffee_shop_address_3,
            description = R.string.coffee_shop_desc_3,
            imageResourceId = R.drawable.dp
        ),
        Recommendation(
            id = 4,
            name = R.string.restaurant_name_1,
            category = R.string.category_name_2,
            address = R.string.restaurant_address_1,
            description = R.string.restaurant_desc_1,
            imageResourceId = R.drawable.amo
        ),
        Recommendation(
            id = 5,
            name = R.string.restaurant_name_2,
            category = R.string.category_name_2,
            address = R.string.restaurant_address_2,
            description = R.string.restaurant_desc_2,
            imageResourceId = R.drawable.birch
        ),
        Recommendation(
            id = 6,
            name = R.string.restaurant_name_3,
            category = R.string.category_name_2,
            address = R.string.restaurant_address_3,
            description = R.string.restaurant_desc_3,
            imageResourceId = R.drawable.bidda
        ),
        Recommendation(
            id = 7,
            name = R.string.place_name_1,
            category = R.string.category_name_3,
            address = R.string.place_address_1,
            description = R.string.place_desc_1,
            imageResourceId = R.drawable.okean
        ),
        Recommendation(
            id = 8,
            name = R.string.place_name_2,
            category = R.string.category_name_3,
            address = R.string.place_address_2,
            description = R.string.place_desc_2,
            imageResourceId = R.drawable.luna
        ),
        Recommendation(
            id = 9,
            name = R.string.place_name_3,
            category = R.string.category_name_3,
            address = R.string.place_address_3,
            description = R.string.place_desc_3,
            imageResourceId = R.drawable.zoo
        ),
        Recommendation(
            id = 10,
            name = R.string.park_name_1,
            category = R.string.category_name_4,
            address = R.string.park_address_1,
            description = R.string.park_desc_1,
            imageResourceId = R.drawable.aleksandr
        ),
        Recommendation(
            id = 11,
            name = R.string.park_name_2,
            category = R.string.category_name_4,
            address = R.string.park_address_2,
            description = R.string.park_desc_2,
            imageResourceId = R.drawable.oxta
        ),
        Recommendation(
            id = 12,
            name = R.string.park_name_3,
            category = R.string.category_name_4,
            address = R.string.park_address_3,
            description = R.string.park_desc_3,
            imageResourceId = R.drawable.dvor
        ),
        Recommendation(
            id = 13,
            name = R.string.shop_name_1,
            category = R.string.category_name_5,
            address = R.string.shop_address_1,
            description = R.string.shop_desc_1,
            imageResourceId = R.drawable.plaz
        ),
        Recommendation(
            id = 14,
            name = R.string.shop_name_2,
            category = R.string.category_name_5,
            address = R.string.shop_address_2,
            description = R.string.shop_desc_2,
            imageResourceId = R.drawable.gk
        ),
        Recommendation(
            id = 15,
            name = R.string.shop_name_3,
            category = R.string.category_name_5,
            address = R.string.shop_address_3,
            description = R.string.shop_desc_3,
            imageResourceId = R.drawable.cm
        ))
}