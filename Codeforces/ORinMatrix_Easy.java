// https://codeforces.com/problemset/problem/486/B

import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {

        int t = 1;

        // Uncomment for multiple test cases
        // t = fs.nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
        out.close();
    }

    static void solve() {

        int m = fs.nextInt();
        int n = fs.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
                arr[i][j]=fs.nextInt();
            }
        }
        
        ArrayList<Integer> row=new ArrayList<>();
        ArrayList<Integer> col=new ArrayList<>();
        
        for(int i=0;i<m;i++){
            boolean isTrue=true;
            for(int j=0;j<n;j++){
                if(arr[i][j]!=1){
                    isTrue=false;
                    break;
                }
            }
            if(isTrue){
                row.add(i);
            }
        }
        
        for(int i=0;i<n;i++){
            boolean isTrue=true;
            for(int j=0;j<m;j++){
                if(arr[j][i]!=1){
                    isTrue=false;
                    break;
                }
            }
            if(isTrue){
                col.add(i);
            }
        }
        int[][] ans=new int[m][n];
        for(int r:row){
            for(int c:col){
               ans[r][c]=1;
            }
        }
        int[][] res=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(ans[i][j] == 1){
                    for(int k=0; k<n; k++) res[i][k] = 1;
                    for(int k=0; k<m; k++) res[k][j] = 1;
                }
            }
        }
        boolean isTrue=true;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(res[i][j]!=arr[i][j]){
                    isTrue=false;
                    break;
                }
            }
        }
        if(!isTrue) {
            out.println("NO");
        } else {
            out.println("YES");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    out.print(ans[i][j]+" ");
                }
                out.println();
            }
        }
    }

    /* ================= Utility Methods ================= */

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    static long power(long a, long b) {
        long result = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                result *= a;
            }

            a *= a;
            b >>= 1;
        }

        return result;
    }

    static long modPower(long a, long b, long mod) {
        long result = 1;

        a %= mod;

        while (b > 0) {
            if ((b & 1) == 1) {
                result = (result * a) % mod;
            }

            a = (a * a) % mod;
            b >>= 1;
        }

        return result;
    }

    static void sort(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int x : arr) {
            list.add(x);
        }

        Collections.sort(list);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }

    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    /* ================= Fast Scanner ================= */

    static class FastScanner {

        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];

        private int ptr = 0;
        private int len = 0;

        private int read() {
            if (ptr >= len) {
                ptr = 0;

                try {
                    len = in.read(buffer);
                } catch (IOException e) {
                    return -1;
                }

                if (len <= 0) {
                    return -1;
                }
            }

            return buffer[ptr++];
        }

        int nextInt() {
            int c;

            while ((c = read()) <= ' ') {
                if (c == -1) {
                    return -1;
                }
            }

            int sign = 1;

            if (c == '-') {
                sign = -1;
                c = read();
            }

            int val = 0;

            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }

            return val * sign;
        }

        long nextLong() {
            int c;

            while ((c = read()) <= ' ') {
                if (c == -1) {
                    return -1;
                }
            }

            int sign = 1;

            if (c == '-') {
                sign = -1;
                c = read();
            }

            long val = 0;

            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }

            return val * sign;
        }

        String next() {
            int c;

            while ((c = read()) <= ' ') {
                if (c == -1) {
                    return null;
                }
            }

            StringBuilder sb = new StringBuilder();

            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }

            return sb.toString();
        }
    }
}
