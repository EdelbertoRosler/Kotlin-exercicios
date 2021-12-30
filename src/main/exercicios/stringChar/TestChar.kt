//4) Implemente um programa em Kotlin que conte o número de vogais, consoantes, espaços em
//branco e números em um texto lido.
package stringChar

import java.lang.Double.parseDouble
import java.util.*


fun main(args: Array<String>){
    val scan = Scanner(System.`in`)
    val allVowels = listOf('a','e','i','o','u','A','E','I','O','U')
    val allConsonants = listOf('b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z',
                                'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z')
    var sumVowels = 0
    var sumConsonants = 0
    var sumNumbers = 0

    println("write text: ")
    val newText = scan.nextLine()
    val arrayPalavras = newText.split(" ".toRegex().toString())//separa a String por palavras e coloca em um array
    val arraCharSequence = newText.toCharArray()//separa a string em caracteres e coloca em um array

    for (i in arraCharSequence){//verifica as vogais
        for(j in allVowels)
            if (i == j ){
                sumVowels ++
        }
    }
    for (i in arraCharSequence){//verifica as consoantes
        for(j in allConsonants)
            if (i == j ){
                sumConsonants ++
            }
    }

    for(i in arrayPalavras)//verifica cada palavra para ver se é número
        if (isNumeric(i)) sumNumbers ++


    println("Espaços em branco: ${arrayPalavras.size - 1}")
    println("Vogais: $sumVowels")
    println("Consoantes: $sumConsonants")
    println("Números: $sumNumbers")

}


fun isNumeric (str: String): Boolean {//verifica se a string passada no parâmetro é numérico
    var numeric = true
    try {
        var num = parseDouble(str)
    } catch(e: NumberFormatException){
        numeric = false;
    }
    return numeric
}
