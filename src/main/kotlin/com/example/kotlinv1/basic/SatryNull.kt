package com.example.kotlinv1.basic

fun getNullStr(): String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0

fun main() {

    val nullableStr = getNullStr()

    val nullableStrLength = nullableStr?.length ?: "null인 경우 반환".length
    println(nullableStrLength)

    val length = getLengthIfNotNull(null)
    println(length)

    val a = "Kotlin"
    val b: String? = null
    println(b?.length)
    println(a?.length) // Unnecessary safe call

    //throw NullPointerException()

//    val c: String? = null
//    val d = c!!.length
}