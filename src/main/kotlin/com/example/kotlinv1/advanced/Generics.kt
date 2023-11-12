package com.example.kotlinv1.advanced


class MyGenerics<out T>(val t: T) {

}

class Bag<T> {

    fun saveAll(
            to: MutableList<in T>,
            from: MutableList<T>,
    ) {
        to.addAll(from)
    }
}

fun main() {
    val bag = Bag<String>()
    bag.saveAll(mutableListOf<CharSequence>("1","2"), mutableListOf<String>("3", "4"))


    // 제네식을 상요한 클래스의 인스턴스를 만드려면 타입 아규먼트를 제공
    val generics1 = MyGenerics<String>("test")
    // 공변성
    val charGenerics : MyGenerics<CharSequence> = generics1



    // 타입 생략가능
    val generics2 = MyGenerics("test")

    // 변수의 타입에 제네릭을 사용한경우
    val list1: MutableList<String> = mutableListOf()
    // 타입 아규먼트를 생성장에서 추가
    val list2 = mutableListOf<String>()

    val list3 : List<*> = listOf<String>("test")
    val list4 : List<*> = listOf<Int>(1,2,3,4,5)

    // 변성 : 공변셩 단공변셩 무공변셩
    // PECS (Producer - Extends, Consumer - Super)
    // 공변셩은 자바 제네릭의 extends 코틀린 에선 out
    // 반공변셩은 자바 제네릭의 super 코틀린에서는 in
}







