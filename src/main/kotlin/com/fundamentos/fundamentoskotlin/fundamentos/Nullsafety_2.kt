package com.fundamentos.fundamentoskotlin.fundamentos

fun main() {
    val ninja: Pessoa? = Pessoa("Madara", 100)

    println(ninja?.nome)
}