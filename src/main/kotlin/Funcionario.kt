open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    open val porcentagemDeBonificacao = 0.1
    open val bonificacao: Double
        get() =  salario * porcentagemDeBonificacao

}