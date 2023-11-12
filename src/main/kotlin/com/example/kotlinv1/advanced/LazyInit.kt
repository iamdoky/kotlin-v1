package com.example.kotlinv1.advanced

//  코틀린의 지연 초기화 2가지 중 첫번째 by_lazy
//  Lazy Init /  Late Init

class HelloBot {
     val greeting: String by lazy(LazyThreadSafetyMode.PUBLICATION ) {
    // val greeting: String by lazy {
//    val greeting: String by lazy(LazyThreadSafetyMode.NONE) {
        println("초기화 로직 수행")
        getHello()
    }

    fun sayHello() = println(greeting)

}


fun getHello() = "안냥하세요."
fun main() {

    val helloBox = HelloBot()

    // ...
    // ...

    // helloBox.greeting = getHello()  // 지연할당 방식.
    for (i in 1 ..5) {
        Thread {
            helloBox.sayHello()
        }.start()
    }

    // helloBox.sayHello()
    // helloBox.sayHello()

}