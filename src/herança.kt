open class Eletronico(var marca: String) { //classe que vamos herdar
    fun ligar() {}
    fun desligar() {}
}

class Computador(marca: String) : Eletronico(marca) { //classe que herdou
    fun instalarSoftware() {}
    fun processar() {}


}

fun main() {
    var c: Computador = Computador("DELL")
    c.ligar()
    c.desligar()
    c.marca
}