package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        val temparray = arrayListOf(0, 1)
        var buf = 0
        while (temparray[0] * temparray[1] < n) {
            buf = temparray[1]
            temparray[1] = temparray[0] + temparray[1]
            temparray[0] = buf
        }
        if (temparray[0]*temparray[1] > n) temparray.add(0) else temparray.add(1)
        return temparray.toIntArray()
    }
}
