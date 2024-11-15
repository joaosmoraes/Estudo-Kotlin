class Pessoa(val anoNascimento: Int, var nome: String) {

    var olhos: String=""
    fun dormir() {
        TODO("Not yet implemented")
    }

    fun acordar() {
        TODO("Not yet implemented")
    }
}

fun dormir() {

}

fun acordar() {

}

fun main() {
    // no construtor eu consigo ter lógica , nos parametros "chumbados" não
    // class - comportamentos e atributos
    // classe -> (instancia) objetos
    // this -> escopo da instancia da classe o objeto
    var pessoa: Pessoa = Pessoa(2000, "fulano")
    pessoa.nome
    pessoa.dormir()
    pessoa.acordar()


}