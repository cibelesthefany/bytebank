class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    override val senha: Int,
    val plr: Double

) : Gerente(
    nome,
    cpf,
    salario,
    senha
) {


    override fun bonificacao(): Double {
        return salario * 0.3
    }



    override fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }


}
