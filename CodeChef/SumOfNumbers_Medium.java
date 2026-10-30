// https://www.codechef.com/problems/NUMSUM?tab=statement

import java.io.*;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int t = fs.nextInt();
        for (int i = 0; i < t; i++) {
            solve(fs);
        }
    }

    static void solve(Scanner fs) {
        BigInteger n = fs.nextBigInteger();

        BigInteger nPlusOne = n.add(BigInteger.ONE);

        BigInteger product = n.multiply(nPlusOne);

        BigInteger result = product.divide(BigInteger.valueOf(2));

        System.out.println(result);
    }
}
