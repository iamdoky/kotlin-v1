package com.example.kotlinv1.advanced

// data 보관 및 전달 => DTO와 같은 목적
// equals, hashCode, toString, component and copy -> 코틀린 컴파일러가 만들어줌
// 자바에서는 실제 구현하거나 롬복 사용을 했어야 했음
// java15 부터 제공하는 record 흡사
data class Person(var name: String, val age: Int) {

}

fun main() {

    // equals
    val person1 = Person(name = "doky", age = 11)
    val person2 = Person(name = "doky", age = 11)
    println(person1 == person2)

    // equals hash code
    val set = hashSetOf(person1)
    println(set.contains(person2))

    // toString
    person1.name = "DH"
    println(set.contains(person1))

    println("이름 = ${person1.component1()}, 나이 =${person1.component1()}")
    val (name, age) = person1
    println("이름 = ${name}, 나이 = ${age}")


    // 가변객체는 쓰레드에서 문제가 생기고 동시성 또는 안정성에서 문제가 생김
    // 데이터가 변경되니께 ... 불변이 최고임.. 코드를 파악하는 데에도 불변...
    // copy 를 사용하면 객체를 복사하여 임뮤터블 객체를 만들 수 있음

}