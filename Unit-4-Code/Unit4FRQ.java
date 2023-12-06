/**
 *
 * <p>
 * For example, the call longestStreak("CCAAAAATTT!") should return 5
 * because the longest substring of consecutive identical characters is
 * "AAAAA".
 * <p>
 * Write the code segment to be used in the body of the method below. The
 * parameter str is a properly initialized String variable. Your implementation
 * should conform to the example above.
 **/

public class Unit4FRQ {

    public static void main(String[] args) {
        System.out.println(longestStreak("CCAAAAATTT!") == 5);
    }

    /**
     * The method longestStreak is intended to determine the longest substring of
     * consecutive identical characters in the parameter str and return the length
     * of that substring.
     * @param str - original string
     * @return int - the length of the longest streak of a character
     */
    public static int longestStreak(String str) {
        String maxChar = " ";
        int maxLen = 0;
        int cur = 0;
        String curChar = " ";
        for (int i = 0; i < str.length(); i++) {
            curChar = str.substring(i, i + 1);
            cur = i + 1;
            while (cur < str.length() && str.substring(cur, cur + 1).equals(curChar)) {
                cur++;
            }
            if (cur - i > maxLen) {
                maxLen = cur - i;
                maxChar = curChar;
            }
        }
        return maxLen;
    }
}
