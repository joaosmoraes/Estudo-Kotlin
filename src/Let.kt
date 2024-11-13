fun main() {
    val str: String? = null
    if (str != null) {
        str.lowercase()
        str.length

    }

    str?.let {         // `str?` indica que a variável `str` pode conter um valor nulo (null) ou uma string válida O método let só será executado se `str` não for nula, evitando um NullPointerException
        it.lowercase() // Converte `str` para letras minúsculas; o valor não é armazenado ou usado
        it.length // Calcula o comprimento da string `str`

    }

    }

