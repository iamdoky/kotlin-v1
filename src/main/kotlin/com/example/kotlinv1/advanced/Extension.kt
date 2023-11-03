package com.example.kotlinv1.advanced


//


// 확장 함수 Extension Function
// 확장의 대상 그뒤에 변수 또는 함수를 넣어 사용
fun String.first() : Char {
    return this[0]  // this 리시버 또는 수신자 객체라고 부른다.
}

fun String.addFirst(char: Char) : String {
    return char + this.substring(0)
}

fun main () {
    println("AVCD".first())
    println("AVCD".addFirst('Z'))
}

