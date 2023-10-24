package com.example.kotlinv1.basic

class Product(val name: String, val price: Long)

interface Wheel {
    fun roll()
}

// 인터페이스 키워드 추가 사용
// 코틀린의 인터페이스는 인터페이스 내부에 구현해야 하는 추상 함수와 자바8의 디폴트 인터페이스 처럼
// 구현을 가진 모든 함수를 정의 할 수 있다
// 인터페이스는 상위 인터페이스를 받을 수 있따 -> 하위 인터페이스에ㅓ 재정의 가능
// 하나 이상의 인터페이스 추가가능
interface Cart : Wheel {
    var coin : Int
    val weight : String
        get() = "70"    // 백킹필드?

    fun add(product: Product  )

    // 구현은 없지만 껍데기만 있는 디폴트 함수 지원
    fun rent() {
        if (coin > 0) {
            println("Cart 대여 합니디아~")
        }
    }

    override fun roll() {
        println("카드 굴러가요")
    }

    fun printId() = println("1111")
}

interface Order {
    fun add(product: Product) {
        println("${product.name} 주문이 완료 됌")
    }

    fun printId() = println("2222")
}// 복수의 인터페이스를 구현할때 문제점은 동일한 시그니쳐를 가진 함수를 구현할떄 문제가 생김


// Interface 호출과 상속의 차이점은 생성자 유무
class MyCart(override var coin: Int) : Cart, Order {
    // 구현해야하는 추상 프로퍼티 (Abstract property)
    // override var coin: Int = 0
    override fun add(product: Product) {
        if (coin <= 0) println("코인을 넣어줘어어어")
        else println("${product.name} 이 카트에 추가 되었디야.")

        // Order
        super<Order>.add(product)
    }
    // id
    override fun printId() {
        super<Cart>.printId()
        super<Order>.printId()
    }

    // rent() 를 재정의 하지 않는 이유는 Card 인터페이스에서 직접 구현을 해야하는 메소드 이기 때문에
}

fun main() {
    val cart = MyCart(coin = 100)
    cart.rent()
    cart.roll()
    cart.add(Product("게임", price = 100000))
    cart.printId()
}