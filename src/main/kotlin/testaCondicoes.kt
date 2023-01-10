fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Saldo positivo de $saldo")
        saldo == 0.0 -> println("Saldo neutro de $saldo")
        else -> println("Saldo negativo de $saldo")
    }
}