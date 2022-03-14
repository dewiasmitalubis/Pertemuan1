fun main() {
    //Program ini menerima 2 masukkan bilangan dan akan melakukan operasi tambah, kurang, kali dan bagi dari kedua bilangan yang dimasukkan
    //Simple calculator
    println("Selamat datang di kalkulator")
    println("Input angka pertama:")
    val a = readLine()!!.toDouble()
    println("Input angka kedua:")
    val b = readLine()!!.toDouble()
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b
    println("Sum: ${sum}")
    println("Difference: ${difference}")
    println("Product: ${product}")
    println("Quotient: ${quotient}")
    println("Terima kasih telah menggunakan kalkulator.")
}