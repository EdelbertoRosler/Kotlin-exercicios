package Cursos

import Cursos.enums.TipoGraduacao

class Graduacao(val tipoGraduacao: TipoGraduacao, nome: String, cargaHoraria: Int, ppc: String, qntDocentes: Int,
                qntAlunosFormados: Int, qntAlunosCursando: Int):
    Cursos(nome, cargaHoraria, ppc,qntDocentes, qntAlunosFormados, qntAlunosCursando)

