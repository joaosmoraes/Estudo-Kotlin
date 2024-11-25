
/*
Explicação dos comentários:
Polimorfismo: A variável f na função calculo é do tipo genérico Funcionario, mas o método bonus() chamado depende do tipo real do objeto (Gerente ou Analista).
Interface como contrato: A interface Funcionario define que qualquer classe que a implemente deve fornecer uma implementação do método bonus().
Sobrescrita de métodos: Cada classe (Gerente e Analista) fornece sua própria versão do método bonus(), personalizando o comportamento.
Flexibilidade: A função calculo não precisa de ajustes quando novas classes implementam Funcionario.*/


fun main() {
    // Criando objetos do tipo Funcionario. Embora a referência seja do tipo Funcionario,
    // cada objeto é, na verdade, uma instância de uma classe específica (Gerente ou Analista).
    val gerente: Funcionario = Gerente()
    val analista: Funcionario = Analista()

    // Chamando a função 'calculo' para cada objeto. Essa função utiliza o método 'bonus()'
    // de acordo com o tipo real do objeto (Gerente ou Analista).
    calculo(gerente)
    calculo(analista)
}

// Definição da interface Funcionario
// Essa interface serve como um contrato. Todas as classes que implementarem
// Funcionario devem fornecer uma implementação para o método 'bonus'.
interface Funcionario {
    fun bonus() // Método abstrato que será implementado pelas classes concretas.
}

// Implementação da classe Gerente, que segue o contrato da interface Funcionario.
class Gerente : Funcionario {
    // Sobrescrevendo o método 'bonus' para a classe Gerente.
    override fun bonus() {
        println("Bônus do gerente.") // Define o comportamento específico para Gerente.
    }
}

// Implementação da classe Analista, também baseada na interface Funcionario.
class Analista : Funcionario {
    // Sobrescrevendo o método 'bonus' para a classe Analista.
    override fun bonus() {
        println("Bônus do analista.") // Define o comportamento específico para Analista.
    }
}

// Função que aceita um objeto do tipo Funcionario.
// Essa função é genérica, ou seja, funciona para qualquer classe que implemente Funcionario.
fun calculo(f: Funcionario) {
    // Chama o método 'bonus()' do objeto recebido.
    // Graças ao polimorfismo, o método chamado será o correspondente ao tipo real do objeto.
    f.bonus()
}
