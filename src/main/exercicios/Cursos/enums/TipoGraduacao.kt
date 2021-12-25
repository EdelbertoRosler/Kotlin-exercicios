package cursos.enums

enum class TipoGraduacao(descricao: String?) {
    BACHARELADO("Bacharelado"),
    LICENCIATURA("Licenciatura"),
    SUPERIORTECNOLOGIA("Superior Tecnologia");

    private var descricao = descricao

    open fun TipoGraduacao(descricao: String?) {
        this.descricao = descricao
    }

    open fun getDescricao(): String? {
        return descricao
    }

}