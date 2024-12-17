fun main() {
    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha","Berlim"))

    val map2 = mutableMapOf<String , String> (Pair("França","Paris"), Pair("Alemanha","Berlin"))
    println(map1.entries)
    println(map2.entries)

    map2["Brasil"] = "Brasilia"
    println(map2)
    map2.remove("Brasil")
    map2.contains("Brasil")
    map2.clear()
    /*Vantagens de usar Map
1. Associar Chaves a Valores
O Map permite associar chaves únicas a valores, o que facilita a busca e o gerenciamento de dados relacionados.
Exemplo: Associar países (chaves) às suas capitais (valores).
2. Busca Eficiente
Mapas são otimizados para buscas rápidas. Usando a chave, você pode acessar o valor correspondente diretamente sem precisar percorrer todos os elementos.
3. Imutabilidade e Mutabilidade
mapOf (imutável) é útil quando os dados não precisam ser alterados, garantindo segurança e consistência.
mutableMapOf (mutável) é útil quando os dados precisam ser alterados dinamicamente, como adicionar ou remover pares.
4. Operações Úteis
Métodos como contains, get, put, remove, clear e outros permitem uma manipulação simples e eficiente dos dados.
5. Uso em Contextos Reais
Mapas são ideais para representar:
Dicionários (palavra → significado).
Tabelas de configuração (opção → valor).
Relacionamentos diretos (chave → valor).*/
}