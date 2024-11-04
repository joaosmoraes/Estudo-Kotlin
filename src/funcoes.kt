fun main() {
    // função unit unica linha fazendo multiplicação
    fun multiplicacao(a: Int, b: Int) = a * b
    println(multiplicacao(1, 1))
    val str = "oi"
    println("tamanho da string é : ${str.length}")


    val str2 = "kotlin kotlin" // Define uma string chamada `str2`

    println(str2.replace("kotlin", "kotlin2"))  // Saída: kotlin2 kotlin2
    println(str2.lowercase()) // Saída: kotlin kotlin
    println(str2.uppercase()) // Saída: KOTLIN KOTLIN
    print("                      meu  nome é  ".trim())  // Saída: meu  nome é

    fun conversaoAnos(anos: Int) {
        println("$anos ano(s) equivale(m) a:")
        println("${anos * 12} meses")
        println("${anos * 365} dias")
        println("${anos * 365 * 24} horas")
        println("${anos * 365 * 24 * 60} minutos")
        println("${anos * 365 * 24 * 60 * 60} segunds")
    }

    fun tamanhoString(str: String): Int {
        return str.length
    }

    fun cubo(n: Int): Int {
        return n * n * n
    }

    fun milhasEmKm(milhas: Float): Float {
        return milhas * 1.6f
    }

    fun trocaLetras(str: String): String {
        return str.lowercase().replace("a", "x")
    }

    fun tamanhoStringUnicaLinha(str: String) = str.length
    fun cuboUnicaLinha(n: Int) = n * n * n
    fun milhasEmKmUnicaLinha(milhas: Float) = milhas * 1.6f

    fun main() {
        conversaoAnos(2)
        println(tamanhoString("Programação Kotlin."))
        println(cubo(2))
        println(milhasEmKm(100f))
    }


}










