package acuario

fun construirAcuario() {
    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario8.imprimirTamano()

    val mitorre = TanqueTorre(diametro = 25, alto = 40)
    mitorre.imprimirTamano()

}

fun main() {
    construirAcuario()
}