fun main() {
    /*karena berbedanya representasi maka tipe yang memiliki ukuran lebih kecil bukanlah subtypes
    dari tipe yang lebih besar. Jadi kita haruslah melakukan konversi ke bentuk lainnya secara eksplisit
     */
    val valInt: Int = 1
    val valSum: Long = 3L + valInt //konversi implisit
    println("Konversi variabel valInt secara implisit : $valSum")
    val valLong: Long = valInt.toLong() // konversi eksplisit
    println("Konversi variabel valInt secara eksplisit : $valLong")
}