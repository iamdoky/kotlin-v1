package com.example.kotlinv1

class Coffee(
        var name: String = "",
        var price: Int = 0,
        var iced: Boolean = false,
) {

    val brand: String
        get() {
            return "스타벅스"
        }

    var quantity : Int = 0
        set(value) {
            if (value > 0) { // 수량이 0 이상인 경우에만 할당
                field = value
            }
        }

}

class EmptyClass