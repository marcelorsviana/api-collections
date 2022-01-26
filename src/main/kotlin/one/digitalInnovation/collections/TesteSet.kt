package one.digitalInnovation.collections

fun main() {
    // Instanciando 3 objetos do tipo Funcionario

    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")


    // Alocando os funcionários em dois conjuntos

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    println()
    println("Unindo os conjuntos em um só.")
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }


    println("Subtraindo um ou mais elementos (ou objetos) do conjunto.")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("Imprimindo apenas o elemento (ou objeto) que é comum aos conjuntos.")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}