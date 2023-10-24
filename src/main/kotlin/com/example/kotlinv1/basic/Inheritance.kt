package com.example.kotlinv1.basic

open class Dog() {
    open var age: Int = 0
    open fun bark() {
        println("ㅋㅓㅇ컹")
    }
}

// 코틀린은 Buldog() : Dog() -> : 를 통해서 상속을 간단하게 할 수 있다.
open class BullDog(override var age : Int = 0) : Dog() {
    // final keyword로 상속을 막을 수 있다.
    // final override fun bark() {
    override fun bark() {
//        println("멍멍")
        super.bark()
    }
}

 class ChildBullDog : BullDog() {
    override var age: Int = 0;
    override fun bark() {
        super.bark()
    }
}

// 추상 클래스
abstract class Developer() {
    abstract var age: Int
    abstract fun code(language: String)
}

class BackEndDev(override var age: Int) : Developer() {
    override fun code(language: String) {
        println("I code with $language")
    }
}

fun main() {
    var backEndDev =  BackEndDev(age = 20)
    println(backEndDev.age)
    backEndDev.code("java")


    val dog = BullDog(2)
    println(dog.age)
    dog.bark()
}