fun nOccurrences(s: String, c: Char): Int {
    var counter = 0

    for(i in 10 downTo 2)
        println(i)


    for (letter in s){
        if(c == letter)
            counter++
    }

    for (pos in 0 until stringLength(s))
        if (c == charAt(s, pos))
            counter++

    s.filter { it != 'c' }.length

    return counter
}

fun main() {
    val n = nOccurrences("Hello", 'e')
    println(n)
}