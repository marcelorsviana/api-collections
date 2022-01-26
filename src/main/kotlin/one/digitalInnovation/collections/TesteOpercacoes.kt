package one.digitalInnovation.collections

fun main() {
    println()
    println("Criando um 'doubleArrayOf()' e imprimindo os valores.")
    val salarios = doubleArrayOf(2000.0, 1400.0, 4000.0, 1600.0)

    for (salario in salarios) {
        println(salario)
    }

    println()
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    val salariosMaiorQue1700 = salarios.filter { it > 1700.0 }

    println()
    println("Os salários que são maiores que 1700.0:")
    salariosMaiorQue1700.forEach { println(it) }

    println()
    println("Qual é a quantidade de salários que estão entre 2000.0 e 5000.0?")
    println(salarios.count { it in 2000.0..5000.0})

    println()
    println("Utilizando o método 'find' para verificar a existência de um elemento em uma coleção.")
    println("LEMBRE-SE: Ele retorna o elemento se o encontrar. Caso não encontre, retorna 'null'")
    println(salarios.find { it == 1400.0})
    println(salarios.find { it == 500.0})


    println()
    println("Utilizando o método 'any' para verificar a existência de um elemento em uma coleção.")
    println("LEMBRE-SE: Retorna 'true' caso haja o elemento na coleção e retorna 'false' caso não haja.")
    println(salarios.any { it == 1600.0})
    println(salarios.any { it == 1000.0})





}