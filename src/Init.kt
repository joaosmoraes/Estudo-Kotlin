
/*Explicação:
O construtor primário recebe um parâmetro chamado especie (do tipo String).
Este parâmetro é automaticamente armazenado como uma propriedade da classe porque você utilizou var antes do nome especie.
 Isso significa que a classe Animal terá um atributo acessível diretamente, chamado especie.
A inicialização e configuração adicional são realizadas no bloco init,
que é executado logo após a construção do objeto. Neste caso,
o valor de fala é definido de acordo com a espécie fornecida no construtor.
*/
class Animal(var especie: String) {//O construtor primário recebe um parâmetro chamado especie (do tipo String).
    var fala: String = ""

    init {
        fala = if (especie == "cachorro") {
            "au"
        } else if (especie == "gato") {
            "miau"
        } else {
            ""
        }
    }

    fun falar() {// metodo falar
        println(fala)
    }
}

fun main() {
    Animal("cachorro").falar() // Chama o método falar da instância criada e imprimi a string
}
/*
* Explicação:
Classe Animal: A classe Animal possui uma variável especie que é passada para o construtor
*  e uma variável fala que é definida com base na especie. 
* O init é utilizado para inicializar a variável fala de acordo com o valor de especie.
Método falar(): A função falar é um método da classe que imprime o valor de fala, o que é a "fala" do animal.
Função main(): A função main é onde você cria uma instância da classe Animal, passando "cachorro" como argumento.
*  Em seguida, chama o método falar() dessa instância para imprimir a fala do cachorro.*/

