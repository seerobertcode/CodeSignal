package arcade.intro.theJourneyBegins

fun main() {
    println("Is a aabbaa a palindrome? ${checkIfPalindromeUsingSubstring("aabbaa")}")
    println("Is a aabbaa a palindrome? ${checkIfPalindromeUsingReverse("aabbaa")}")
}

fun checkIfPalindromeUsingSubstring (inputString: String): Boolean {
    var reversedString = ""
    var i = inputString.length - 1
    for (char in inputString.iterator()) {
        reversedString += (inputString.substring(i, i + 1))
        i--
    }
    return reversedString.equals(inputString)
}

fun checkIfPalindromeUsingReverse(inputString: String): Boolean {
    var reverseInputString :String = inputString.reversed();
    return inputString.equals(reverseInputString,ignoreCase = true )
}