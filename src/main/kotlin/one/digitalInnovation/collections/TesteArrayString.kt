package one.digitalInnovation.collections

fun main() {
    println("Criando um array de strings, atribuindo valores e imprimindo a iteração dele")

    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "Susana"

    for (nome in nomes) {
        println(nome)
    }

    println()
    println("Colocando os elementos do array em ordem alfabética:")
    nomes.sort()
    nomes.forEach { println(it) }


    println()
    println("Criando um novo array através de 'arrayOf', colocando seus elementos em ordem alfabética e imprimindo o resultado da iteração:")

    val nomes2 = arrayOf("Maria", "João", "Susana")

    println()
    nomes2.sort()
    nomes2.forEach { println(it) }

    println()
    print("""
        LEMBRE-SE:
        
        'Array()'
            1) você deve informar o número de índices.
            2) você deve atribuir valores a cada índice individualmente.
          
        'ArrayOf()'
            1) não é preciso informar o número de índices.
            2) declare todos os valores já quando se cria o array.
    """)
}