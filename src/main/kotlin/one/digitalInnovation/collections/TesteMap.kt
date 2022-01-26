package one.digitalInnovation.collections

fun main() {

    // Utilizando 'Pair()' para criar uma chave e um valor.

    val pair: Pair<String, Double> = Pair("Joao", 1000.0)

    // Transformando 'pair' em um elemento de map.
    val map1 = mapOf(pair)

    // Iterando o map.
    map1.forEach { (k, v) -> println("Chave: $k - valor: $v") }

    println()
    println("Utilizando o recurso para funções chamado de 'infix'")
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )

    // Iterando o novo map.
   map2.forEach { (k, v) -> println("Chave: $k - valor: $v") }

}