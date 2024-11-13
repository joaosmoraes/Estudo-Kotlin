fun main() {
    endereco("street", "city", "sp", "09909090", 2)
}

fun endereco(rua: String, cidade: String, estado: String, cep: String, num: Int = 0) {
    println("Rua: $rua")
    println("Cidade: $cidade, $estado - $cep")

}

