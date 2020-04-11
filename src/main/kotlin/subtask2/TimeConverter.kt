package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val numeric = arrayOf("one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four",
            "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine")
        var hour = Integer.parseInt(hour)
        var minute = Integer.parseInt(minute)
        if (hour > 12) return ""
        return when (minute) {
            0 -> "${numeric[hour - 1]} o' clock"
            in (1..29).filter { it != 15 } -> {
                if (minute == 1) "one minute past ${numeric[hour - 1]}" else "${numeric[minute - 1]} minutes past ${numeric[hour - 1]}"
            }
            15 -> "quarter past ${numeric[hour- 1]}"
            30 -> "half past ${numeric[hour - 1]}"
            45 -> "quarter to ${numeric[hour]}"
            in (31..59).filter { it != 45 } -> {
                if (minute == 31) "one minute to ${numeric[hour - 1]}" else "${numeric[59 - minute]} minutes to ${numeric[hour]}"
            }
            else ->  ""
        }
    }
}
