package media1

import java.util.*
import kotlin.collections.ArrayList

fun main(){

    mediaValues(3)

}

fun mediaValues(qnt: Int): Unit {//informa a quantidade de valores que serão registrados
    val scan = Scanner(System.`in`)
    val values: MutableList<Double> = ArrayList()

    println("informe os Valores: ")
    for(i in 0..qnt-1){
        val n = scan.nextDouble()
        values.add(i, n)//preenche a lista
    }

    var sum = values.reduce { count, number -> count + number } // soma os elementos da lista
    println("media = %.2f".format(sum/values.size))
}