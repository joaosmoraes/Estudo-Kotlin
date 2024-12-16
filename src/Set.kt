fun main() {


    val set1 : Set<String> = setOf<String>("Paris", "Berlin" , "Madrid" , "Madrid")
    val set2 : MutableSet<String> = mutableSetOf<String>("Poá")

    set2.add("São Paulo")
    //set2.remove("São Paulo")
    set2.contains("São Paulo")

    //set2.clear()
    set2.size


    set1.contains("Poá")

    println(set1 )
    println(set2 )
    /*Resumo do comportamento
Conjuntos (Set): Não permitem elementos duplicados.
Conjuntos mutáveis (MutableSet): Permitem adicionar e remover elementos após sua criação.
Operações comuns incluem
adicionar (add), remover (remove), verificar existência (contains), limpar (clear)
e obter o tamanho (size).*/

}
