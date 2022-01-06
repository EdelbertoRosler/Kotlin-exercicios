//5) Faça uma função em Kotlin que recebe uma série de valores Double e retorna a média simples deles.

package media1

import java.util.*
import kotlin.collections.ArrayList

fun main(){

    mediaValues(4)

}

fun mediaValues(qnt: Int): Unit {//qnt serve para registrar a quantidade de valores que serão passados
    val scan = Scanner(System.`in`)
    val values: MutableList<Double> = ArrayList()

    println("informe os Valores: ")
    for(i in 0..qnt-1){
        val n = scan.nextDouble()
        values.add(i, n)//preenche a lista com os valores passados
    }

    var sum = values.reduce { count, number -> count + number } // soma os elementos da lista
    println("media = %.2f".format(sum/values.size))//calcula e imprime na tela a média simples
}