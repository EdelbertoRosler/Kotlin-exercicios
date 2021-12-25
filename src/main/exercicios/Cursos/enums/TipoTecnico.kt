package cursos.enums

enum class TipoTecnico(descricao: String?) {
    SAUDE("Saúde"),
    EXATAS("Exatas"),
    HUMANAS("Humanas"),
    MILITAR("Militar");

    private var descricao = descricao

    open fun TipoTecnico(descricao: String?) {
        this.descricao = descricao
    }

    open fun getDescricao(): String? {
        return descricao
    }
}