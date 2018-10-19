class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> current = new HashSet<Character>();
        int maxLen = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            if (!current.contains(c)) {
                current.add(c);
                maxLen = Math.max(maxLen, right - left + 1);
                continue;
            }

            while (true) {
                char leftChar = s.charAt(left);
                left++;
                if (leftChar == c) break;
                current.remove(leftChar);
            }
        }
        return maxLen;
    }
}