open class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    open val senha: Int

) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario

        }

    open fun autenticacao(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }


}