/* Author : Shubhankar Kotnala
 * Problem : Reverse every word in a statement
 * Explanation : 'hello' makes 'olleh', but this needs to be done for a whole string
 */
const str = "This string needs to be reversed";

var reversedStr = str
    .split("") //gives back every letter
    .reverse() //reverses the array given by `split`
    .join("") //joins back the reversed array
    .split(" ") //splits the reversed array by `space` (every word)
    .reverse() // reverses the words occurences, makes them from end to start
    .join(" "); // joins back to make a statement with reversed words
console.log(reversedStr)