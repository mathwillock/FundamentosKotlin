package com.fundamentos.fundamentoskotlin.fundamentos


fun main() {
//    não podemos declarar um variável como null. Então passamos o tipo da variável e colocamos ao final um '?'.
//    agora a variável pode receber um valor null.
//    O kotlin por default tenta se blindar de nullPointerException.

    var name: String? = "Matheus"

    println(name?.length)

    name = null

    println(name?.length?.toShort())

    when {
        comecaComM(name) -> println(name)
        else -> println(name)
    }

//    Elvis operator ?:
    val tamanho: Int = name ?: 0
    println("tamanho = $tamanho")

//    Listas também podem receber valores null ou serem null.

    val lista: List<Int?> = listOf(1, 2, 3, null)

    val listNullable: List<Int?>? = null

    println(lista)
    println(listNullable)

}

fun comecaComM(x: Any?): Boolean {
    return when (x) {
        is String -> x.startsWith("m")
        else -> false
    }
}