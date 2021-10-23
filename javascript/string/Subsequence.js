/* Author : Shubhankar Kotnala
 * Problem : Find if a given string is a subsequence of another string
 * Explanation : Any string whose letters come in a sequence of another is called to be its subsequence
 */
const mainStr = "abcdebfg";
const shortStr = "bce";

var p = 0;
var count = 0;
for (var i = 0; i < shortStr.length; i++) {
    var j = count;
    for (j; j < mainStr.length; j++) {
        if (mainStr.charAt(j) == shortStr.charAt(i)) {
            p++;
            count = j;
            break;
        }
    }
}
if (p === shortStr.length) {
    console.log("true");
}
else {
    console.log("false", p, shortStr.length);
}
