package com.fundamentos.fundamentoskotlin.fundamentos

// Criando uma classe
// o que é uma class? É uma representanção abstrata do  mundo Real, como pessoa, carro, animal.
// Uma classe possui atributos
// Por exemplo Uma classe pessoa possui nome, idade.
// O que é um construtor? é o que utilizamos para criar uma classe especifica
class Pessoa (var nome: String, var idade: Int) {

    override fun toString(): String {
        return "A pessoa $nome tem $idade anos."
    }
}

fun main() {
    // Criado um objeto da classe pessoa
    val pessoinha = Pessoa("Nathiele", 24)
    println(pessoinha)
}