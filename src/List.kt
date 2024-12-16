fun main() {
    val listaImutavel = listOf("Item1", "Item2", "Item3")
// listaImutavel.add("Item4") // Isso dará erro, pois a lista é imutável
    println(listaImutavel) // Output: [Item1, Item2, Item3]

    val listaMutavel = mutableListOf("Item1", "Item2", "Item3")
    listaMutavel.add("Item4") // Adiciona um elemento
    listaMutavel.remove("Item2") // Remove um elemento
    println(listaMutavel) // Output: [Item1, Item3, Item4]

}