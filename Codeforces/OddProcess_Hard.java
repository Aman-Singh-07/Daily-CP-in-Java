// https://codeforces.com/contest/2176/problem/C

import java.util.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        long t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();
            int mx_odd = Integer.MIN_VALUE;
            for (int i = 0 ; i < n ; i++) {
                int x = input.nextInt();
                if (x % 2 == 0) {
                    even.add(x);
                } else {
                    odd.add(x);
                    if (x > mx_odd) {
                        mx_odd = x; 
                    }
                }
            }
            even.sort(Comparator.reverseOrder());
            odd.sort(Comparator.naturalOrder());
            ArrayList<Long> bag = new ArrayList<>();
            long bag_sum = 0;
            if (odd.size() > 0) {
                bag_sum += mx_odd;
                bag.add(bag_sum);
            }
            if(even.size() == 0) {
                for (int k = 1 ; k <= n ; k++) {
                    if(k % 2 == 0) {
                        System.out.print("0 ");
                    } else {
                        System.out.print(mx_odd + " ");
                    }
                }
                System.out.println();
            } else if ( even.size() == n ) {
                for (int k = 0 ; k < n ; k++) {
                    System.out.print("0 ");
                }
                System.out.println();
            }
            else {
                int i = 0, j = 0;
                while (i < even.size() || j < odd.size() - 1) {
                    if (i < even.size()) {
                        bag_sum += even.get(i);
                        if (bag_sum % 2 == 0) {

                            bag_sum = 0;
                        }
                        bag.add(bag_sum);
                        i++;
                    } else {
                        if (j + 2 <= odd.size() - 1) {
                            bag_sum -= even.get(even.size() - 1);
                            i--;
                            j += 2;
                            bag.add(bag_sum);
                        } else {
                            bag_sum += odd.get(j);
                            if (bag_sum % 2 == 0) {
                                bag_sum = 0;
                            }
                            bag.add(bag_sum);
                            j++;
                        }
                        
                    }
                }
                for (int k = 0 ; k < bag.size() ; k++) {
                    System.out.print(bag.get(k) + " ");
                }
                System.out.println();
            }
        }
    }
}
