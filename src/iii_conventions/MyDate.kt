package iii_conventions

import java.util.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {

    private val dateStamp = year.toString() + month.toString().padStart(2, '0') + dayOfMonth.toString().padStart(2, '0')

    override fun compareTo(other: MyDate) = when {
        dateStamp < other.dateStamp -> -1
        dateStamp > other.dateStamp -> 1
        else -> 0
    }
}

operator fun MyDate.rangeTo(other: MyDate): DateRange = todoTask27()

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate)
