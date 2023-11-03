package com.example.kotlinv1.advanced

import java.util.*
import java.util.stream.Collectors

fun main() {

    // immutable
    val currencyList = listOf("달러", "원", "위안", "엔화", "유로")

    // mutable
    val mutableCurrencyList = mutableListOf<String>()
    mutableCurrencyList.add("달러")
    mutableCurrencyList.add("원")
    mutableCurrencyList.add("엔화")
    mutableCurrencyList.add("유로")

    // immutable set
    val numberSet = setOf(1, 2, 3, 4)

    // mutable set
    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    // immutable map
    // ex) key to value
    val numberMap = mapOf("one" to 1, "two" to 2)

    // mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap["two"] = 2

    // Collection builder
    val numList: List<Int> = buildList {
        add(5555)
    }

    // 컬렉션 빌더는 내부에서는 mutable return은 immutable
    val numberList = buildList {
        add(1)
        add(2)
        add(2)
    }


    // linkedList
    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    // arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = currencyList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
    println("============")

    for (currency in currencyList) {
        println(currency)
    }
    currencyList.forEach {
        println(it)
    }

    // for loop -> map
    val lowerList = listOf("a", "c", "d", "z")
    val upperList = mutableListOf<String>()

    for (lowerCase in lowerList) {
        upperList.add(lowerCase.uppercase())
    }

    val upperList2 = lowerList.map { it.uppercase() }
    println(upperList2)

    val filteredList = mutableListOf<String>()
    for (upperCase in upperList) {
        if (upperCase == "A" || upperCase == "C") {
            filteredList.add(upperCase)
        }
    }

    val filteredList2 = upperList.filter { it == "A" || it == "C" }
    val filteredList3 = upperList.stream().filter { it == "A" || it == "C" }
        .collect(Collectors.toList())

    // 인라인 함수 vs 터미널 오퍼레이터
    // 시퀀스 api 최종 컬랙션 생성 시  ...
    val filteredList4 = upperList
        .asSequence()
        .filter { it == "A" || it == "C" }
        .toList()

    println(filteredList2)
    println(filteredList3)
    println(filteredList4)

}