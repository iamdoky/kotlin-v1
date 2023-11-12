package com.example.kotlinv1.advanced


// Top Level function?


// 확장 함수 Extension Function
// 확장의 대상 그뒤에 변수 또는 함수를 넣어 사용
fun String.first() : Char {
    return this[0]  // this 리시버 또는 수신자 객체라고 부른다.
}

fun String.addFirst(char: Char) : String {
    return char + this.substring(0)
}

class MyExample {
    fun printMessage() = println("class 출력")
}

fun MyExample.printMessage(message: String) = println("확장 출력")

fun MyExample?.printNullOrNotNull() {
    if (this == null) print("널인 경우")
    else print("널이 아닌 경우")
}

fun main () {
    var myExmaple: MyExample? = null
    myExmaple.printNullOrNotNull()

    myExmaple = MyExample()
    myExmaple.printNullOrNotNull()


    MyExample().printMessage()
    MyExample().printMessage("확장  출력")
    println("AVCD".first())
    println("AVCD".addFirst('Z'))
}

