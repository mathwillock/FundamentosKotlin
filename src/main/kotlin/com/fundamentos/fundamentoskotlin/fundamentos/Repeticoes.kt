package com.fundamentos.fundamentoskotlin.fundamentos

fun main(){
    loopNumbers()
    loopNumbersRevert()
    loopNumbersStep()
    loopRange(15, 20)
    whileMenorQue10()
    doWhileMenorQue10()
}

fun loopNumbers() {
    for(numero in 0 .. 10) {
        println(numero)
    }
}

fun loopNumbersRevert(){
    for(numero in 10 downTo  0) {
        println(numero)
    }
}

fun loopNumbersStep(){
    for(numero in 0 .. 10 step 2){
     println(numero)
    }
}

fun loopRange(inicio: Int, fim: Int){
    for(numero in inicio .. fim){
        println(numero)
    }
}

fun whileMenorQue10(){
//    Valida a condição antes de rodar
    var x = 0
    while (x < 10){
        println("x = $x")
        x++
    }
}

fun doWhileMenorQue10(){
//     Executa e depois valida
    var x = 10
    do{
        println("x = $x")
        x++
    } while (x < 10)
}