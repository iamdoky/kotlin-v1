package com.example.kotlinv1.advanced

import javax.print.attribute.standard.MediaSize.Other

// sealed class 는 하나의 상위 클래스 또는 인터레이스에서 하위클래스에 대한 정의를 할 수 있는 클래스
//  sealed class 는 하위 클래스를 제한 조건에 따라서 정의해야하고 컴파일러가 컴파일 시에 확일 할 수 있다. 이렇게 만들어진 클래스들은 ..,
// 두가지 타입에 대해서는 컴파일 시에 컴파일러가 알고 있다
// sealed 클래시는 하위 클래스를 제한 조건에따라서 정의해야 한다.
// 제한기준 -> 하위 클래스들은 동일 패키지 또는 동일 모듈안에 있어야 한다.
// 예전에는 동일한 파일안에 있어야 했는데 패키지 또는 모듈안에 있으면된다. 상속바받아서 사용한다.

sealed class Developer {
    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("저는 백엔드 개발자입니다? ${language}를 사용합니다?")
    }
}

data class FrontendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("저는 프론트엔드 개발자입니다? ${language}를 사용합니다?")
    }
}

data class AndroidDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("나는 안드로이드 개발자 ${language}를 사용합니다.")
    }
}

object OtherDeveloper : Developer() {
    override val name: String = "익명"
    override fun code(language: String) {
        TODO("Not yet implemented")
    }
}

object DeveloperPool {
    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when (developer) {
        // 강제적으로 정의를 해주어야 하기에 버그가 줄어든다.
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
        is AndroidDeveloper -> pool[developer.name] = developer
        is OtherDeveloper -> println("지원하지 않은 개발자 종류 입니다.")
//        else -> {
//            println("지원 하지 않은 개발자 입니다.")
//        }
    }

    fun get(name: String) = pool[name]
}

fun main() {
    val backendDeveloper = BackendDeveloper(name = "tony")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper(name = "james")
    DeveloperPool.add(frontendDeveloper)

    val androidDeveloper = AndroidDeveloper(name = "안드로")
    DeveloperPool.add(androidDeveloper)
    println(DeveloperPool.get("james"))
    println(DeveloperPool.get("tony"))
    println(DeveloperPool.get("안드로"))

}