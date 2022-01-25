package one.digitalInnovation.collections

fun main() {
    println()
    println("Criando um 'DoubleArray()' e imprimindo a iteração dos valores dele.")

    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }

    println()
    println("Utilizando o método 'forEachIndexed()' e imprimindo os valores atualizados.")


    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach { println(it) }

    println()
    println("Criando um novo array através de 'doubleArrayOf()' e colocando seus elementos em ordem crescente.")

    val salarios2 = doubleArrayOf(1700.0, 1250.00, 5000.00)
    salarios2.sort()
    salarios2.forEach { println(it) }

}