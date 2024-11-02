
fun main() {
    val idade: Int = 30               // Variável Int
    val taxa: Float = 1.5f            // Variável Float

    // Operações com Int e Int
    val somaInt = idade + 10
    val subtracaoInt = idade - 5
    val multiplicacaoInt =  idade * 2
    val divisaoInt = idade / 3
    val restoInt = idade % 4

    // Operações com Int e Float
    val somaFloat = idade + taxa      // Resultado será Float
    val subtracaoFloat = idade - taxa // Resultado será Float
    val multiplicacaoFloat = idade * taxa // Resultado será Float
    val divisaoFloat = idade / taxa       // Resultado será Float
    val restoFloat = idade % taxa
    // Operação módulo com Float (conversão implícita)

    // Resultados
    println("Operações Int e Int:")
    println("Soma: $somaInt")                   // 40
    println("Subtração: $subtracaoInt")         // 25
    println("Multiplicação: $multiplicacaoInt") // 60
    println("Divisão: $divisaoInt")             // 10
    println("Resto da Divisão: $restoInt")      // 2

    println("\nOperações Int e Float:")
    println("Soma: $somaFloat")                  // 31.5
    println("Subtração: $subtracaoFloat")        // 28.5
    println("Multiplicação: $multiplicacaoFloat") // 45.0
    println("Divisão: $divisaoFloat")            // 20.0
    println("Resto da Divisão: $restoFloat")     // 0.0
    println("final")

    /*
                      Operações Int e Float:
     Quando você usa um Int com um Float
     o resultado é promovido automaticamente a Float para evitar perda de precisão.
                        Operações Mistas:
         O Kotlin permite operações entre Int e Float, mas sempre converte o resultado para Float.
         O operador módulo % também funciona entre Int e Float, mas o Kotlin faz a conversão para Float.
        Isso oferece flexibilidade para trabalhar com diferentes tipos numéricos em Kotlin.
                                                                                            */
}
