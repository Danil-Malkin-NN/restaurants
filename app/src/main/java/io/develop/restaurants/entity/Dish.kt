package io.develop.restaurants.entity


data class Dish(
    var name: String = "",
    var cost: Float = 0.0F,
    var description: String = "",
    var marks: Float = 0.0F,

    ) {

    companion object Empty {
        val NONE: Dish = Dish()
    }

}