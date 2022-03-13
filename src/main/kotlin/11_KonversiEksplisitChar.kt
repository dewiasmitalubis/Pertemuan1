fun main() {
    //ASCII value
    var c: Char
    var i: Int // nilai ordinal (ASCII) karakter konversi dari teks ke nilai ASCII
    c = 'a'
    i = c.toInt()
    println("The character $c was converted to its ASCII value of $i")

// konversi dari nilai ASCII ke teks
    i = 98
    c = i.toChar()
    println("The ASCII value of $i was converted to its textual value of $c")
}