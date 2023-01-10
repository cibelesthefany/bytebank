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
