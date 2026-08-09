// https://leetcode.com/problems/minimum-total-price-after-applying-discounts/description/

class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double price = 0.0;
        int n = prices.length;
        int m = discounts.length;
        int i = n - 1;
        int j = m - 1;
        while (i >= 0 && j >= 0) {
            price += (double) prices[i] * (100 - discounts[j]) / 100.0;
            i--;
            j--;
        }
        while (i >= 0) {
            price += prices[i];
            i--;
        }
        return price;
    }
}
