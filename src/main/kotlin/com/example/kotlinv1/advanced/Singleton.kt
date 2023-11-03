package com.example.kotlinv1.advanced

import java.time.LocalDateTime
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler.DEFAULT

// single object create
//object Singleton {
//    val a = 1234
//    fun printA() = println(a)
//}
//
//
//fun main() {
//    println(Singleton.a)
//    Singleton.printA()
//}

//object DateTileUtils {
//    val now: LocalDateTime
//        get() = LocalDateTime.now()
//
//    // 상수 enum 처럼
//    const val DEFAULT_FORMAT = "YYYY-MM-DD"
//
//    fun same(a: LocalDateTime, b: LocalDateTime): Boolean {
//        return a == b
//    }
//}
//
//fun main () {
//    println(DateTileUtils.now)
//    println(DateTileUtils.now)
//    println(DateTileUtils.now)
//
//    println(DateTileUtils.DEFAULT_FORMAT)
//
//    val now = LocalDateTime.now()
//    println(DateTileUtils.same(now, now))
//}

// 코틀린 동반객체 Companion Object class 내부에서 생성되는 객체
class MyClass {

    private constructor()

    companion object MyCompanion{
        val a = 1234
        // MyClass 를 직접 생성자를 통해서 초기화를 하지 못하게
        fun newInstance() = MyClass()
    }
}

fun main() {
    println(MyClass.MyCompanion.a) // Companion 생략가능
    println(MyClass.MyCompanion) // Companion 생략가능
    println(MyClass.a)
    println(MyClass.newInstance())
}