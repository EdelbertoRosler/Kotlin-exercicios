
import kotlin.collections.ArrayList

/* Implemente um programa em linguagem Kotlin que recebendo um texto e um caractere,
encontre o número de ocorrências deste caractere no texto
*/


fun main(){

    val exampleString = "Thiiis is my new string"
    val myChar = 'i'
    var cont = 0
    val caracteres: MutableList<Char> = ArrayList()

    for (i in 0 until exampleString.length) caracteres.add(exampleString[i])

    for (i in 0 until caracteres.size){
        if (caracteres[i] == myChar){
            cont ++
        }
    }
    println("Total: " + cont)

}


