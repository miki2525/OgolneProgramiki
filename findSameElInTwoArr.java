import java.util.*;

import static java.lang.String.*;

class zadanie5 {

    public static String findIntersection(String[] str) {

        String[] arr1 = str[0].split(",");
        String[] arr2 = str[1].split(",");

        StringBuilder out = new StringBuilder("");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].trim().equals(arr2[j].trim())) {
                    out.append(arr2[j].trim() + ",");
                }
            }
        }
        if (out.length() < 1){
            return "false";
        }
        out.deleteCharAt(out.length()-1);
        return out.toString();
    }

    public static void main(String args[]) {
     String[] str = {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
     String[] str2 = {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"};
     String[] str3 = {"21, 22, 23, 25, 27, 28", " 24, 29"};
        System.out.println(findIntersection(str));
        System.out.println(findIntersection(str2));
        System.out.println(findIntersection(str3));
    }
}