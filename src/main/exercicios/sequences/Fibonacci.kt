package sequences

fun main(){
    println(SequenceFibonacci().take(11).toList())
}


fun SequenceFibonacci(): Sequence<Int>{
    return generateSequence(Pair(0,1), {Pair(it.second, it.first + it.second)}).map { it.first }
}