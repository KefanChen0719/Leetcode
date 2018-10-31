class Solution {
    public int myAtoi(String str) {
        int index = 0, sign = 1, result = 0;
        
        if (str == null || str.length() == 0) return 0;

        while (index < str.length() && str.charAt(index) == ' ') index++;
        if (index == str.length()) return 0;

        if(str.charAt(index) == '+') index++;
        else if (str.charAt(index) == '-') {
            sign = -1;
            index++;
        }
        
        int max_base = Integer.MAX_VALUE / 10;
        int max_remainder = Integer.MAX_VALUE % 10;
    
        while (index < str.length()) {
            char c = str.charAt(index);
            if (c < '0' || c > '9') break;
            int digit = c - '0';

            if (result > max_base || result == max_base && digit > max_remainder)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            result = result * 10 + digit;
            index++;
        }
        
        return result * sign;
    }
}