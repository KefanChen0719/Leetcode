class Solution {
    public int reverse(int x) {
        int result = 0, maxBound = Integer.MAX_VALUE / 10, minBound = Integer.MIN_VALUE / 10;
        while (x != 0) {
            int current = x % 10;
            if (result > maxBound || (result == maxBound && current > 7)) return 0;
            if (result < minBound || (result == minBound && current < -8)) return 0;
            result = result * 10 + current;
            x /= 10;
        }
        return result;
    }
}