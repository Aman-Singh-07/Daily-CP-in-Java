// https://www.codechef.com/problems/SUPVIL?tab=ide

import java.util.*;

class Solution {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int hero = 1;     
            int villain = 1;  
            boolean decided = false;
            for (int i = 0; i < n; i++) {
                String s = input.next();
                if (s.endsWith("man") || s.endsWith("woman")) {
                    hero++;
                } else {
                    villain++;
                }
                if (hero - villain >= 2) {
                    System.out.println("superheroes");
                    decided = true;
                    for (int j = i + 1; j < n; j++) input.next();
                    break;
                } else if (villain - hero >= 3) {
                    System.out.println("villains");
                    decided = true;
                    for (int j = i + 1; j < n; j++) input.next();
                    break;
                }
            }
            if (!decided) {
                System.out.println("draw");
            }
        }
    }
}
