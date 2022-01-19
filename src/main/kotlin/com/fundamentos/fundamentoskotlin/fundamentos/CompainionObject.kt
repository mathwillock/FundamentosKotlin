package com.fundamentos.fundamentoskotlin.fundamentos

data class FirstClass(
    var nome: String,
    var endereco: String,
    var idade: Int
){
    companion object {
        fun criarClasseComValoresPadrao(): FirstClass =
            FirstClass("Matheus", "Rua teste, 100", 13)

        fun criarAPartirDaSecondClass(secondClass: SecondClass): FirstClass =
            FirstClass(secondClass.nome,secondClass.endereco, secondClass.idade)
    }

}


data class SecondClass(
    var nome: String,
    var endereco: String,
    var idade: Int
){
    fun criarClasseComValoresPadrao(): SecondClass =
        SecondClass("Matheus", "Rua teste, 100", 13)
}

fun main() {
    var firstClass = FirstClass.criarClasseComValoresPadrao()

    var secondClass = SecondClass("Gustavo", "rua tal, numero tal", 22).criarClasseComValoresPadrao()
    // nos força a escrever as informações mas nãò constroi a function com os dados que enviamos.
    var myLoader = FirstClass.criarAPartirDaSecondClass(secondClass)

    println(firstClass)
    println(secondClass)
    println(myLoader)

}