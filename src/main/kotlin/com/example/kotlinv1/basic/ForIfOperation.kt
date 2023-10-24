package com.example.kotlinv1.basic

fun main() {
    // 범위 연산자 .. 를 사용해 for loop 돌리기
    for (i in 0..3) {
        println(i)
    }

    // until 을 사용해 반복한다
    // 뒤에 온 숫자는 포함하지 않는다
    for (i in 0 until 3) {
        println(i)
    }

    // step 에 들어온 값 만큼 증가시킨다
    for ( i in 0..6 step 2) {
        println(i)
    }
    // downTo를 사용해 반복하면서 값을 감소시킨다

    //if..else 사용
    val job = "Software Developer"

    if (job == "Software Developer") {
        println("개발자")
    } else {
        println("개발자아님")
    }


    //코틀린의 if...else는 표현식이다
    val age : Int = 10

    val str = if (age > 10) {
        "성인"
    } else {
        "아이"
    }

    //코틀린은 삼항 연산자가 없다. if..else가 표현식이므로 불필요하다
    val a = 1
    val b = 2
    val c = if (b > a) b else a
    // 자바 코드를 코틀린의 when식으로 변환한 코드
    val day = 2

    val result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        else -> "기타"
    }
    println(result)

    // else를 생략할 수 있다
    when(getColor()) {
        Color.RED -> print("red")
        Color.GREEN -> println("green")
        else -> println("blue")
    }

    // 여러개의 조건을 콤마로 구분해 한줄에서 정의할 수 있다
    when (getNumber()) {
        0, 1 -> print("0 또는 1")
        else -> print("0 또는 1이 아님")
    }

    // 자바의 while문과 동일
    // 조건을 확인하고 참이면 코드 블록을 실행한 후 다시 조건을 확인
    var x = 5

    while (x > 0) {
        println(x)
        x--
    }
}

enum class Color {
    RED, GREEN, BLUE
}

fun getColor() = Color.RED

fun getNumber() = 2