import java.util.*;

import static java.lang.String.*;

class zadanie5 {

    public static boolean isPalindrome(String str, int begin, int end){
        while (begin < end){
            if (str.charAt(begin) != str.charAt(end)){
                return  false;
            }
            begin++;
            end--;
        }
        return true;
    }

    public static String checkPalindromeByRmvChar(String str) {
        int startIndex = 0;
        int endIndex = str.length() - 1;

        while (startIndex < endIndex) {
            if (str.charAt(startIndex) == str.charAt(endIndex)) {
                startIndex++;
                endIndex--;
            } else {
                StringBuilder ans = new StringBuilder("");

                if (isPalindrome(str, startIndex + 1, endIndex)) {
                    ans.append(str.charAt(startIndex));
                    return ans.toString();
                } else if (isPalindrome(str, startIndex + 2, endIndex)) {
                    ans.append(str.charAt(startIndex));
                    ans.append(str.charAt(startIndex + 1));
                    return ans.toString();
                }

                if (isPalindrome(str, startIndex, endIndex - 1)) {
                    ans.append(str.charAt(endIndex));
                    return ans.toString();
                } else if (isPalindrome(str, startIndex, endIndex - 2)) {
                    ans.append(str.charAt(endIndex - 1));
                    ans.append(str.charAt(endIndex));
                    return ans.toString();
                }
                    return  "It cannot be a palidrome";
            }
        }

        return "It is a palindrome";
    }

    public static void main(String args[]) {
     String str = "aadcbbaa";
        System.out.println(checkPalindromeByRmvChar(str));
    }
}