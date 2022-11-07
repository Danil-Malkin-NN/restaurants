package io.develop.restaurants.entity

data class EatingPoint(
    var name: String = "",
    var mark: Float = 0.0F,
    var description: String = "",
    var address: Address = Address.NONE,
    var bestDish: Dish = Dish.NONE,


    ) {

    companion object Empty {
        val NONE: EatingPoint = EatingPoint()
    }

}