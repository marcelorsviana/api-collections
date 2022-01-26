package one.digitalInnovation.collections

fun main() {

    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println()
    println("Imprimindo o resultado da função estendida criada 'somatoria'")
    println(salarios.somatoria())

    println()
    println("Imprimindo o resultado da função estendida criada 'media'")
    println(salarios.media())

}