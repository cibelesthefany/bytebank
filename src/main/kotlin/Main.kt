fun main() {

    println("Bem vindo ao Bytebank!")

    val contaCibele = Conta(titular ="Cibele", numeroConta = 1000)
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


class Conta(
    var titular: String,
    val numeroConta: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saque(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        } else {
            println(
                "Você tentou fazer um saque de $valor, e não tem valor suficiente para esse saque. Tente um " +
                        "valor menor ou equilavente ao disponível em conta. Seu saldo é de:"
            )
        }
    }

    fun transferencia(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

}


fun testaCopiasERef() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("x $numeroX")
    println("Y $numeroY")

    val contaPH = Conta("PH", 1003)
    var contaClaudia = Conta("Claudia", 1004)
    contaClaudia.titular = "Claudia"

    println("Titular conta PH: ${contaPH.titular}")
    println("Titular conta Claudia: ${contaClaudia.titular}")
}

fun testaLacos() {
    var i = 0
    while (i < 5) {

        val titular = "Cibele $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.00

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo atual: $saldo")
        println()
        i++
    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Saldo positivo de $saldo")
        saldo == 0.0 -> println("Saldo neutro de $saldo")
        else -> println("Saldo negativo de $saldo")
    }
}