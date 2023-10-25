package com.example.kotlinv1.basic

enum class PaymentStatus(val label: String) : Payable  {
    UNPAID("미지급") {
        override fun isPayable(): Boolean = true
    },
    PAID("지급") {
        override fun isPayable(): Boolean = false
    },
    FAILED("실패") {
        override fun isPayable(): Boolean = false
    },
    REFUNDED("환불") {
        override fun isPayable(): Boolean = false
    };

    //     fun isPayable() = false
    // 추상화된 함수
    // abstract fun isPayable(): Boolean
}

interface Payable {
    fun isPayable(): Boolean
}


fun main() {
    println(PaymentStatus.REFUNDED.label)

    if (PaymentStatus.UNPAID.isPayable()) {
        println("결제 가능 상태")
    }

    val valueOf = PaymentStatus.valueOf("PAID")
    println(valueOf)
    println(valueOf.label)

    if (valueOf == PaymentStatus.PAID) {
        println(valueOf)
    }

    for (status in PaymentStatus.values()) {
        println("[$status](${status.label})")
        println("[${status.name}](${status.ordinal})")
    }
}