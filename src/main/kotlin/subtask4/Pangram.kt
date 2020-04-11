package subtask4

class Pangram {

    fun String.isEmpty() : Boolean {
        var actually = true
        this.forEach { if (it != ' ') actually = false }
        return actually
    }
    fun String.isPangram() : Boolean {
        val alphabet = arrayListOf('a', 'b', 'c', 'd', 'e', 'f',
                                        'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                                        'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                                        'w', 'x', 'y', 'z')
        this.toLowerCase().forEach { if (alphabet.contains(it)) alphabet.remove(it) }
        return alphabet.isEmpty()
    }
    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        val vowels = arrayOf('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y')
        val consonants = arrayOf('b', 'B', 'c', 'C', 'd', 'D', 'f', 'F',
            'g', 'G', 'h', 'H', 'j', 'J', 'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'p', 'P', 'q', 'Q', 'r', 'R',
            's', 'S', 't', 'T', 'v', 'V', 'w', 'W', 'x', 'X', 'z', 'Z')
        var countletters = 0
        if (inputString.isEmpty()) return ""
        var words = inputString.split(' ').filter { it != ""}.filter {it != "\n"}.map { StringBuilder(it) }.toMutableList()
        if (inputString.isPangram()) {
            words.forEachIndexed { i, it -> countletters = 0;
                it.forEachIndexed { j, symbol -> if (vowels.contains(symbol))
                {
                    words[i][j] = symbol.toUpperCase();
                    countletters++ }
                };
                words[i] = java.lang.StringBuilder("$countletters${words[i]}");
            }
            words.sortBy { it[0] }
            return words.joinToString(" ")
        } else {
            words.forEachIndexed { i, it -> countletters = 0;
                it.forEachIndexed { j, symbol -> if (consonants.contains(symbol))
                {
                    words[i][j] = symbol.toUpperCase();
                    countletters++ }
                };
                words[i] = java.lang.StringBuilder("$countletters${words[i]}");
            }
            words.sortBy { it[0] }
            return words.joinToString(" ")
        }

    }
}
