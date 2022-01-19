package com.fundamentos.fundamentoskotlin.fundamentos

fun main () {
//    A listOf não é mutável
    val lista = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = lista.filter { it % 2 == 0 }

    println(pares)
//  MutableListOf é mutável
    val listaNumero = mutableListOf<Int>()
    val listaNome = mutableListOf("naruto", "sasuke")

    for (numero in lista) {
        listaNumero.add(numero)
        println(listaNumero)
    }
    println(listaNumero[0])
    println(lista[0])
    println(listaNumero.removeAt(2)) // remove o index o resultado é o elemento encontrado
    println(listaNumero.remove(2)) // remove element o resultado é boolean
    println(listaNumero.shuffle()) // embaralha os itens da lista

    listaNome.add(1, "nathiele")
    listaNome.add("matheus")
    println(listaNome)
    listaNome.sort()
    println(listaNome)

    val list = setOf(1,2,3,4,2) // o setOf não aceita elementos repetidos
    val lis = mutableListOf(1,2,3,4,2)
    println("lista com setOf: $list \nlista sem: $lis")
    println(list.contains(2)) // Boolean

    val mapNomeIdade = mutableMapOf("matheus" to 24, "Gustavo" to 20, "Daniel" to 24) // chave e valor
    mapNomeIdade.put("Bruno", 30)
    mapNomeIdade["Lucas"] = 29

    println(mapNomeIdade)

    mapNomeIdade.remove("Gustavo")

    println(mapNomeIdade)



}





