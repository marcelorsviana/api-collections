package one.digitalInnovation.collections

fun main(){

    val values = IntArray(5)

    values[0] = 2
    values[1] = 1
    values[2] = 0
    values[3] = 4
    values[4] = 3

    println()
    println("Iteração com 'for'")

    for(valor in values) {
        println(valor)
    }

    println()
    println("Iteração com 'for' - tendo por base os índices")

    for (index in values.indices) {
        println(values[index])
    }

    println()
    println("Iteração com 'forEach'")

    values.forEach { println(it) }

    println()
    println("Iteração com 'forEach' - segunda versão")

    values.forEach { valor -> println(valor) }

    println()
    println("Colocando os elementos da lista em ordem crescente")

    values.sort()
    for(valor in values) {
        println(valor)
    }

}
