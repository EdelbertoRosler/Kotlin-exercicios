package stringChar

import java.io.IOException
import java.util.*

val scan = Scanner(System.`in`)
var myWordList: List<Any> = ArrayList()
val mapResult = mutableMapOf<String, Int>()


fun main() {
    fillList(readText("Your text: "))
    println(qntWord()).toString()
}

/**
 * Metodo para lêr uma String
 */
@Throws(IOException::class)
fun readText(txt: String?): String {
    print(txt)
    return scan.nextLine()
}

/**
 * Este metodo recebe um texto, separa as palavras dos espaços em branco e adiciona cada palavra numa lista
 */
fun fillList(text: String) {
    myWordList = text.split(" ".toRegex().toString())
}

/**
 * Este metodo recebe 2 objetos(duas palavras), e verifica se são iguais
 */
fun compareWord(a: Any, b: Any): Boolean {
    return a == b
}

/**
 * Este metodo percorre a listaDasPalavras, e, utilizando o método comparaString, verifica a quantidade
 * total que cada palavra aparecee na lista, coloca em um mapa cada palavra atribuíndo como chave: a palavra, e valor:
 * a quantidade de vezes que a palavra aparece na lista
 */
fun qntWord() {
    for (i in 0 until myWordList.size - 1) {//compara a primeira palavra com as subsequentes e assim por diante
        var contString = 1
        for (j in i + 1 until myWordList.size) {
            if (compareWord(myWordList[i], myWordList[j])) {
                contString ++
            }
        }
        if (!mapResult.containsKey(myWordList[i])) {//
            mapResult[myWordList[i] as String] = contString
        }

    }
    if (!mapResult.containsKey(myWordList[myWordList.size - 1])){//verifica se a última palavra já está no mapa
        mapResult[myWordList[myWordList.size - 1] as String] = 1
    }

    for((key, value) in mapResult){
        println("$key: $value")
    }

}
