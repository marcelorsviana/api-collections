package one.digitalInnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    println()
    println("Iterando o array com o 'forEach'")
    values.forEach {
        println(it)
    }

    println()
    println("Colocando os elementos do array em ordem crescente e iterando com 'forEach' para exibição")
    values.sort()
    values.forEach {
        println(it)
    }
}
