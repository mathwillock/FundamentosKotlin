package com.fundamentos.fundamentoskotlin.fundamentos


fun main(){
    println(retornaNumeroPorExtenso(5))
}

// O código sempre para no primeiro return da resposta correta, sendo assim ele não  se perde.
fun retornaNumeroPorExtenso(numero: Int): String {
    if(numero == 5){
        return "cinco"
    } else if(numero == 6){
        return "6"
    }

    return "numero não mapeado"
}