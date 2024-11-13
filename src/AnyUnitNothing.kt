fun main() {
    //any unit nothing
    /*
    *Any

Significado: Any é o tipo pai de todos os tipos em Kotlin. Ele representa o tipo mais genérico,
*  permitindo que uma variável possa armazenar
* qualquer tipo de valor.
Uso: Any é similar ao tipo Object em Java e pode ser usado para variáveis que precisam aceitar valores de qualquer tipo.
val variavel: Any = "Uma string" // `variavel` pode conter qualquer valor, como números, strings, etc.

*
* Unit

Significado: Unit é o tipo de retorno para funções que não precisam retornar um valor útil.
* Sua presença indica que a função serve apenas para executar uma ação, sem retornar nada significativo.
Uso: Equivalente ao void em Java. Em Kotlin,
* funções que retornam Unit não exigem a palavra-chave return, pois o retorno é implícito.
fun imprimirMensagem(): Unit { // O tipo `Unit` pode ser omitido
    println("Mensagem")
}
Nothing
Não tem retorno ou quando voce quer retornar uma exeção
Significado: Nothing representa a ausência de valor e é usado para expressar que uma função nunca retornará um valor.
Uso: Comumente aplicado em funções que lançam exceções ou entram em um loop infinito,
* Nothing indica ao compilador que o código após essa função não será executado,
* pois não há retorno.fun lancarErro(): Nothing {
    throw Exception("Erro lançado!") // Lança uma exceção, logo, nunca retorna um valor
}
Resumo
Any: Aceita qualquer tipo de valor.
Unit: Função que não retorna valor útil.
Nothing: Indica ausência de retorno (exceções, loops infinitos*/
}
fun valores(value: Any){
    //qualquer valor
}