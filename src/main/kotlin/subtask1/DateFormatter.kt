package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        var textMonth = if (month.length == 1) "0$month" else month
        try {
            return LocalDate.parse("$year-$textMonth-$day").format(DateTimeFormatter.ofPattern("dd MMMM, EEEE"))
        }
        finally {
            return "Такого дня не существует"
        }
    }
}
