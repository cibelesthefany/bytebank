fun main() {
    println("Bem vindo ao Bytebank!")

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

    if (gabriel.autenticacao(1234)) {
        println("Atenticação sucedida!")
    } else {
        println("Aitenticação falhou.")
    }

    val guilherme = Diretor(
        "Guilherme",
        "333.333.333-33",
        4000.0,
        4321,
        200.0
    )


    println("Nome: ${guilherme.nome}")
    println("CPF: ${guilherme.cpf}")
    println("Salário: ${guilherme.salario}")
    println("Bonificação: ${guilherme.bonificacao()}")
    println("PLR: ${guilherme.plr}")

    if (guilherme.autenticacao(4321)) {
        println("Atenticação sucedida!")
    } else {
        println("Aitenticação falhou.")
    }
}




