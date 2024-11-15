

/**
 * Classes enum permitem a definição de uma lista de valores dentro da classe.
 * Útil quando é necessário transitar um intervalo de valores conhecidos,
 * pois restringe as possibilidades e os erros.
 */

enum class Prioridade(val value: Int) {
    Baixo(1) {
        override fun toString(): String {
            //return super.toString()
            return "Prioridade baixa: $value"
        }
    },

    Media(5),
    Alta(15)
}

fun main() {

    // Percorre a lista de valores
    for (p in Prioridade.values()) {
        println(p)
    }

}