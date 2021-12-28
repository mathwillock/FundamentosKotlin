package com.fundamentos.fundamentoskotlin.fundamentos

fun main() {
    println(parOuImpar(2))
    println(parOuImpar(9))
    boletim(6)
    escola(5.2)
    somAnimal("cachorro")
    somAnimal("gato")
}

fun parOuImpar(numero: Int): String {
    return if(numero % 2 != 0 ) {
        "O número é ímpar"
    } else {
        "O número é par"
    }
}

fun boletim(numero: Int) {
    if(numero < 5) {
        println("Reprovado")
    } else if (numero in 5..6) {
        println("Recuperação")
    } else {
        println("Aprovado com mérito!")
    }
}

fun escola(numero : Double) {
    when(numero) {
        in 0.0..4.9 -> println("Aluno reprovado!")
        in 5.0..6.4 -> println("Aluno Retido para recuperação!")
        else -> println("Aluno aprovado!")
    }
}

fun somAnimal(animal : String) {
    when(animal) {
        in "cachorro" -> println("au au")
        in "gato" -> println("miau")
    }
}