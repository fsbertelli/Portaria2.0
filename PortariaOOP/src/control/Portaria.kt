package control

import business.ConvidadoBusiness
import entity.Convidado

class Portaria {
    private val conviteBusiness = ConvidadoBusiness()

    init {
        println("Portaria inicializada")
        println(controle())
    }

    fun controle(): String {
        val idade = Console.readInt("Qual a sua idade?")
        val convidado: Convidado = Convidado(idade = idade)

        if (!conviteBusiness.maiorDeIdade(convidado.idade)) {
            return "Negado. Sua idade é ${idade}"
        }

        convidado.tipo = Console.readString("Qual o tipo de convite?")
        convidado.codigo = Console.readString("Qual o codigo de convite?")

        if (!conviteBusiness.isValid(convidado.tipo)) {
            return "Negado. Convite inválido"
        }
        if (!conviteBusiness.isCodValid(convidado)) {
            return "Negado. Convite inválido"
        }
        return "Welcome!"
    }
}


/*
fun portaria() {
    print("Qual sua idade? ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.")
            return
        }
    }

    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        // Validação do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. entity.Convite inválido.")
            return
        }

        print("Qual o código do convite? ")
        var codigo = readLine()

        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()


    }
}
*/