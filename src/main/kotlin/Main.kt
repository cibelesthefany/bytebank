import kotlin.system.exitProcess

fun main() {
    println("Bem vindo ao Bytebank!")

//    testaComportamentosConta()

    val lucas = Funcionario(
        "Lucas",
        "111.111.111-11",
        salario = 1000.0
    )

    println("Nome: ${lucas.nome}")
    println("CPF: ${lucas.cpf}")
    println("Salário: ${lucas.salario}")
    println("Bonificação: ${lucas.bonificacao()}")

    val gabriel = Gerente(
        "Gabriel",
        "222.222.222-22",
        2000.0,
        1234,
    )

    println("Nome: ${gabriel.nome}")
    println("CPF: ${gabriel.cpf}")
    println("Salário: ${gabriel.salario}")
    println("Bonificação: ${gabriel.bonificacao()}")

    if (gabriel.autenticacao(1234)){
        println("Atenticação sucedida!")
    }else {
        println("Aitenticação falhou.")
    }

}




