package com.example.kotlinv1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinV1Application

// 클래스를 선언하지 않고 선언가능, top level 에 선언가능
var x = 5

fun main(args: Array<String>) {
	runApplication<KotlinV1Application>(*args)

	fun greeting(message: String = "안녕하세요!!") {
		println(message)
	}

	greeting()
	greeting("????")

	println(x + 5)

	val a : Int = 1
	val b = 2
	val c : Int
	c = 5

	// val (value)  = Read Only  final 처럼 값을 초기화 이후에는 재할당이 안됌
	// var (variable) = 가변변수로 재할당 가

//	val e : String = "doky"
//	e = "wisdom"
	var e : String = "doky"
	e = "wisdom"

	// 변수의 타입이 lazy 하게 지정 되면 타입 변경이 안됌
	var ee : Int = 555
	// ee = "String"

	// default argument
	// named argument
	// null safety 하는법이 여러가지 있음!
	// nullable 변수
	var name: String?

	// String?
	// ?.length
	// ?: elvis operation

}
