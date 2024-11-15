class Animal2(var especie: String) {
    var fala2: String = ""
        get() {
            println("acesso get") // Mensagem indicando o acesso ao getter
            return field // Retorna o valor armazenado no campo backing (field)
        }
        set(value) {
            println("acesso set") // Mensagem indicando o acesso ao setter
            field = value // Atualiza o valor do campo backing
        }
}

fun main() {
    val animal = Animal2("gato")
    animal.fala2 = "miau" // Define o valor da propriedade usando o setter
    println(animal.fala2) // Acessa o valor da propriedade usando o getter
}

