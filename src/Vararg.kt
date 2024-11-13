fun main() { // Função principal que será executada ao iniciar o programa
    println(media(false, 10f, 8f, 2, "", false, 98f)) // Chama a função 'media' com diversos argumentos de tipos variados e exibe o resultado
}

fun <T, J> media(abc: J, vararg notas: T): Float { // Função genérica 'media' com dois tipos genéricos T e J
    var soma = 0f // Declara uma variável 'soma' do tipo Float para armazenar a soma dos valores
    for (n in notas) { // Itera sobre cada elemento em 'notas'
        if (n is Float) { // Verifica se o elemento atual é do tipo Float
            soma += n // Se for Float, adiciona o valor à variável 'soma'
        }
    }
    return (soma / notas.size) // Retorna a média, dividindo a soma pelo total de elementos em 'notas'
}

// generics permite vc usar tipos de valores diferentes
