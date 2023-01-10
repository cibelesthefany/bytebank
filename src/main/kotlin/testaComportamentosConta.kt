fun testaComportamentosConta() {
    val contaCibele = Conta(titular = "Cibele", numeroConta = 1000)
    contaCibele.deposita(500.0)

    println(contaCibele.titular)
    println(contaCibele.numeroConta)
    println(contaCibele.saldo)

    println("*********************")

    val contaPaulo = Conta("Paulo", 1001)
    contaPaulo.deposita(1000.0)

    println(contaPaulo.titular)
    println(contaPaulo.numeroConta)
    println(contaPaulo.saldo)

    println("*********************")

    println("Depósito efetuado na conta de Cibele")
    contaCibele.deposita(50.0)
    println(contaCibele.saldo)

    contaPaulo.deposita(75.0)
    println("Depósito efetuado na conta de Paulo")
    println(contaPaulo.saldo)

    println("*********************")

    println("Saque efetuado na conta de Cibele")
    contaCibele.saque(900.0)
    println(contaCibele.saldo)

    println("Saque efetuado na conta de Paulo")
    contaPaulo.saque(75.0)
    println(contaPaulo.saldo)

    println("*********************")

    println("Tranferiando da conta de Paulo para a conta de Cibele")
    println()

    if (contaPaulo.transferencia(55.0, contaCibele)) {
        println("Transferência efetuada com sucesso")
    } else {
        println("Falha na trasnferência, verifique o valor e tente outra vez")
    }

    println()
    println("Saldo da conta de Paulo: ${contaPaulo.saldo}")
    println()
    println("Saldo da conta de Cibele: ${contaCibele.saldo}")
}
