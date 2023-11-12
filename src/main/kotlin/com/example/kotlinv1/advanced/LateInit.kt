package com.example.kotlinv1.advanced

class LateInit {
    // late init 가변 + none null
    // Late Init 은 가변객체 + 널 사용 안됌
    lateinit var text: String

    val textIsInitialized: Boolean
        get() = this::text.isInitialized

    fun printText() {
//        // isInitialized class 내부에서만 사용가능
//        if (this::text.isInitialized) {
//            println("Init")
//        } else {
//            text = "Say, hello"
//        }
        println(text)
    }
}

fun main() {
    val test = LateInit()

    if (!test.textIsInitialized) {
        test.text = "hello!!"
    }

    test.printText()
}