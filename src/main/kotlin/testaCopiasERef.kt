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
