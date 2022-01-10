package group.enum
//2. Partida de Basquete: dois times de basquete são representados por uma lista de jogadores com seus respectivos
// pontos na partida. Implemente em apenas uma linha de código em Kotlin que gere o score final da partida.
// Pesquise sobre groupingBy{} em listas.

import java.util.stream.Collectors.groupingBy

fun main(){
    println(sumPoints)
//    println(sumPoints2)
}

enum class Team {
    YELLOW, BLUE
}

data class PlayerGame (
    val player : String,
    val team : Team,
    val points : Int
)
val match = listOf(
    PlayerGame("13", Team.YELLOW, 12),
    PlayerGame("7", Team.YELLOW, 7),
    PlayerGame("3", Team.YELLOW, 20),
    PlayerGame("22", Team.YELLOW, 16),
    PlayerGame("33", Team.YELLOW, 4),
    PlayerGame("45", Team.YELLOW, 26),
    PlayerGame("8", Team.BLUE, 17),
    PlayerGame("3", Team.BLUE, 15),
    PlayerGame("21", Team.BLUE, 16),
    PlayerGame("30", Team.BLUE, 12),
    PlayerGame("45", Team.BLUE, 24)

)

val sumPoints = match.groupBy { it.team }.mapValues { (_,player) -> player.sumOf { it.points }}
//val sumPoints2 = match.groupingBy{ playerGame -> playerGame.points}.eachCount()
