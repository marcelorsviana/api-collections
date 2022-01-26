package one.digitalInnovation.collections

fun main() {

    // Instanciando 3 objetos do tipo Funcionario

    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")


    // Atribuindo uma lista

    val funcionarios = listOf(joao, pedro, maria)


    // Iterando a lista

    funcionarios.forEach { println(it) }


    // Pesquisando apenas por um objeto específico

    println("Usando 'find' para retornar um objeto específico da lista.")
    println(funcionarios.find {it.nome == "Maria"})

    println("Imprimindo os objetos da lista ordenados por salário através de 'sortedBy'")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("Imprimindo os objetos da lista agrupados por tipo de contratação através de 'groupBy'")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}