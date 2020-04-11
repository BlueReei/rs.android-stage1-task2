package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var buf = 0
        b.forEach {buf = a.indexOf(it, buf, true).also { i -> if (i == -1) return "NO"}}
        return "YES"
    }
}
