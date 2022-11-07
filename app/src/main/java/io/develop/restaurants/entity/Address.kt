package io.develop.restaurants.entity

data class Address(
    var street: String = "",
    var houseNumber: Int = Integer.MAX_VALUE,
    var cityName: String = "",
    var corpus: String = "",
    var pointX: String = "0.0",
    var pointY: String = "0.0"
) {

    companion object Empty {
        val NONE = Address()
    }


}