package com.fundamentos.fundamentoskotlin.fundamentos

// Como declarar uma função?
// Passamos a palavra reservada fun seguido do nome e o return dentro de chaves
// a fun main por default é quem executa quando executamos o nosso projeto
// Funções podem ou não retorna um valor

// tipos de retorno

// - Unit -> vazio void não precisamos passar na fun. fun main() : Unit {}
fun main() {
    println("Hello World!") //Unit
    println(retornaNome())
    cumprimentar("Matheus") // Está function já está printando, então não precisamos printar novamente.
    carro("Ford Ka", 2022)
    carro(ano = 1990, modelo = "Ford Ka") // Passando os paramtros fora de ordem
    qualIdade("Matheus") // Parametro já definido

}
// Tipo de dados
fun retornaNome() : String {
    return "Matheus"
}

// Function que recebe parametros, os params não est'ão pré definidos com valos.
fun cumprimentar(nome: String) {
    println("Olá $nome.")
}

fun carro(modelo: String, ano: Int) {
    println("Modelo: $modelo | ano: $ano")
}

// Param já pré definido
fun qualIdade(nome: String, idade: Int = 18) {
    println("O nome dele deve ser $nome, mas sei que a idade é $idade.")
}




