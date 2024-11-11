fun main() {

    try {
        var s: String? = null
        println(s!!.length)
    } catch (e: NullPointerException) {
        println("variavel nula!")
    }
    println("Fim.")
}