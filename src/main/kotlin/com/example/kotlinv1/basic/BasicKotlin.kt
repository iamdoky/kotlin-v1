package com.example.kotlinv1.basic

// top-level
var x = 555

fun main() {
    //val(value) : 불변(Immutable)
    //var(variable) : 가변(Mutable)

    x += 2
    println(x)

    val a : Int = 2
    val b = 5
    val c : Int
    c = 6

    val d : Int
    d = 555

    var e : String = "Ohayo"
    e = "World world"

    var f = 555
    // f = "hi" // 컴파일 오류 타입은 변경이 불가
}
