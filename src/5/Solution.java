class Solution {
    
    String result;
    int maxLen;
    
    public String longestPalindrome(String s) {
        result = "";
        maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i);
            expand(s, i, i+1);
        }
        return result;
    }
    
    private void expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (right - left - 1 > maxLen) {
            maxLen = right - left - 1;
            result = s.substring(left+1, right);
        }
    }
}