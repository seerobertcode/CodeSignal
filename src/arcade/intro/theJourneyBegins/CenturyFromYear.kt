package arcade.intro.theJourneyBegins

fun main() {
    println("Century from year : ${solution(1700)}")
}

fun solution(year: Int): Int {
    if (year % 100 != 0)
        return year / 100 + 1
    else
        return year / 100
}
