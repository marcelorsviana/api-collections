package one.digitalInnovation.collections

fun main() {
    // Instanciando 3 objetos do tipo Funcionario

    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    println()
    println("Criando uma 'mutableListOf()' e iterando os objetos dentro dela.")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println()
    println("Adicionando 'pedro' à lista mutável 'funcionarios'.")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println()
    println("Removendo 'joao' da lista mutável 'funcionarios'.")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println()
    println("Criando uma lista mutável do tipo 'set' e exibindo seus valores (ou objetos).")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }


    println()
    println("Adicionando elementos (ou objetos) à lista mutável 'funcionarioSet'")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println()
    println("Removendo elementos (ou objetos) da lista mutável 'funcionarioSet'")
    funcionarioSet.remove(pedro)
    funcionarioSet.forEach { println(it) }
}