package com.fundamentos.fundamentoskotlin.fundamentos

fun main() {
    tabuada()
}

fun tabuada(){
    val a = 0
    val b = 0

    for(a in a .. 10) {
        println("tabuada do $a")
        println("--------------")
        for(b in b .. 10) {
            println("$a x $b = ${a*b}")
        }
        println("--------------")
    }
}