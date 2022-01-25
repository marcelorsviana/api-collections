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
}