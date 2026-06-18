// https://leetcode.com/problems/angle-between-hands-of-a-clock/description/?envType=daily-question&envId=2026-06-18

class Solution {
    public double angleClock(int hour, int minutes) {
        int minute_angle = minutes * 6;
        double hour_angle = (hour % 12) * 30 + minutes * 0.5;
        double diff = Math.abs(hour_angle - minute_angle);
        return Math.min(diff,360-diff);
        
    }
}
