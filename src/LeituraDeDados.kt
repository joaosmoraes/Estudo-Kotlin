fun main() {
    println("Digite o seu nome:")
    val nome = readLine()  // Lê o que o usuário digitar

    println("Digite a sua idade:")
    val idade = readLine()?.toIntOrNull()  // Lê a idade e converte para Int, se possível

    if (idade != null) {
        println("Olá, $nome! Você tem $idade anos.")
    } else {
        println("Idade inválida.")
    }
}
