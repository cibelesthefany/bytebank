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