open class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    open val senha: Int

) : Funcionario(
    nome,
    cpf,
    salario
) {

    override fun bonificacao(): Double {
        return super.bonificacao() + salario
    }

    open fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }


}