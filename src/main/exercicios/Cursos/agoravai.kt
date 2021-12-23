package Cursos

import Cursos.enums.TipoGraduacao
import Cursos.enums.TipoTecnico

fun main(){

    val graduacao1 = Graduacao(
        TipoGraduacao.BACHARELADO,
        "Ciência da computação",
        1000,
        "estudo de caso",
        15,
        120,
        42)

    val tecnico1 = Tecnico(
        TipoTecnico.HUMANAS,
        "Português",
        850,
        "estudo de caso",
        12,
        132,
        38
    )

    println(graduacao1.tipoGraduacao.getDescricao() + " - " + graduacao1.nome + " - " + graduacao1.qntAlunosCursando)
    println(tecnico1.tipoTecnico.getDescricao() + " - " + tecnico1.nome + " - " + tecnico1.qntAlunosCursando)
}