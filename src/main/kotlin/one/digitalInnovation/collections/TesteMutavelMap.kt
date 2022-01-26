package one.digitalInnovation.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println()
    println("Imprimindo um objeto específico de um repositório ('mutableMapOf') através do 'findById()'")
    println(repositorio.findById(joao.nome))

    println()
    println("Imprimindo todos os objetos de um repositório ('mutableMapOf') através do 'findAll()'.")
    repositorio.findAll().forEach { println(it) }

    println()
    println("Removendo um objeto do repositório ('mutableMapOf') através do 'remove()' e imprimindo o restante da lista.")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach { println(it) }

}