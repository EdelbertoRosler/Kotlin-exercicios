//2) Explique o que faz o código abaixo.
package newTest

import java.lang.Double.parseDouble

fun main(args: Array<String>) {
    val string = "12345s15"
    var numeric = true
    try {
        val num = parseDouble(string)
    } catch (e: NumberFormatException) {
        numeric = false
    }
    if (numeric)
        println("$string is a number")
    else
        println("$string is not a number")
}

//O programa recebe uma string e verifica se é possível transformá-lo em double.
//No caso, como tem um caractere "s" no meio da string, o programa não consegue transformar em
//valor Double.