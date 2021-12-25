package cursos

import cursos.enums.TipoTecnico

class Tecnico(val tipoTecnico: TipoTecnico, nome: String, cargaHoraria: Int, ppc: String, qntDocentes: Int,
              qntAlunosFormados: Int, qntAlunosCursando: Int):
    Cursos(nome, cargaHoraria, ppc,qntDocentes, qntAlunosFormados, qntAlunosCursando)