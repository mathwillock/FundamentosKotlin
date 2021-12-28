package com.fundamentos.fundamentoskotlin.fundamentos

class Dono (var nome: String, var idade: Int){
    override fun toString(): String {
        return "Dono(nome='$nome', idade=$idade)"
    }
}

class Carro ( var cor: String, var anoFabricacao: Int, var dono: Dono){

    override fun toString(): String {
        return "Carro(cor='$cor', anoFabricacao=$anoFabricacao, dono=$dono)"
    }
}

fun main() {
    var carrinho = Carro("Vermelho", 2020, Dono("Matheus", 24))

    println(carrinho.cor)

    println(carrinho)

    carrinho.cor = "preto"

    println(carrinho.cor)

    println(carrinho)

    println(carrinho.dono.nome)

    carrinho.dono.nome="Alex"

    println(carrinho.dono.nome)

}




