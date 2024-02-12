package business

import entity.Convidado

class ConvidadoBusiness {

    fun isValid(tipoConvite: String) = (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo")

    fun isCodValid(convite: Convidado) = when (convite.tipo) {
        "comum" -> convite.codigo.startsWith("xt")
        "premium", "luxo" -> convite.codigo.startsWith("xl")
        else -> false
    }

    fun maiorDeIdade(idade : Int) = idade >= 18
}



