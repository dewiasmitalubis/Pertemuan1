fun main() {
    //String merupakan array dari karakter dan bersifat immutable
    val myName: String = "Dewi Asmita Lubis"
    for(chr in myName){
        print(chr)
    }
    print('\n')

    //operator + bisa menggabungkan string dengan tipe data lain
    val s = "abc" + 1
    println(s + "def")

    //triple quotes (""") dapat menyimpan data string yang memuat keywords
    var text = """
    for (c in "foo")
    print(c)
    """
    println(text)
}