package sequences
//01.Fibonacci: gere uma série de números Fibonacci com apenas uma linha de código em Kotlin.
// Pesquise sobre o método generateSequence.

fun main(){
    println(SequenceFibonacci().take(11).toList())
}


fun SequenceFibonacci(): Sequence<Int>{
    return generateSequence(Pair(0,1), {Pair(it.second, it.first + it.second)}).map { it.first }
}