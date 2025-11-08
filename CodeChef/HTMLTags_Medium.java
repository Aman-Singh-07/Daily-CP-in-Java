//  https://www.codechef.com/problems/HTMLTAGS?tab=ide

import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String s = input.next();
            if (s.startsWith("</") && s.endsWith(">")) {
                String body = s.substring(2, s.length() - 1);
                if (!body.isEmpty() && body.chars().allMatch(c -> Character.isLowerCase(c) || Character.isDigit(c))) {
                    System.out.println("Success");
                } else {
                    System.out.println("Error");
                }
            } else {
                System.out.println("Error");
            }
        }
    }
}
