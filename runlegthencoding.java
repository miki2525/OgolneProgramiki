import java.util.*;

import static java.lang.String.*;

class zadanie5 {
    public static void main(String args[]) {
        String str = "wwwggopp";

        String str1 = "";

        for(int i= 0; i < str.length(); i++) {
            int counter = 1;
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                counter++;
                i++;
            }

            str1 += String.valueOf(counter) + str.charAt(i);

        }
    }
}