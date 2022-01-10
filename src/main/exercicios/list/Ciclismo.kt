package list

//3. Ciclismo: Temos um array (vetor) de dados que representam as elevações em metros obtidas em uma rota.
// Para simplificar, suponha que tenhamos uma corrida curta de  2.5 km. A cada 100 metros percorridos, temos uma medida
// de elevação, ou seja, 25 medidas. Como podemos obter o ganho cumulativo em metros com apenas uma linha de código
// apartir dos dados abaixo (a resposta deve ser 55)? Pesquise sobre zipWithNext{} e filtros de listas.


fun main(){
    println(sumMeters)

}

val altitudes = listOf(800, 805, 804, 800, 803, 806, 809, 805, 800, 798, 796, 799,
                        803, 805, 808, 812, 815, 816, 819, 822, 826, 830, 832, 835, 837)

var sumMeters = altitudes.zipWithNext{a,b -> b - a}.filter{it>0}.sum()

//var sumMeters = altitudes.zipWithNext{a,b -> b - a}.reduce{ count, number -> count + number }


