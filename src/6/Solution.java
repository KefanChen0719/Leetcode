class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += 2 * (numRows - 1)) {
                result.append(s.charAt(j));
                if (i == 0 || i == numRows- 1) continue;
                int gap = 2 * (numRows - i - 1);
                if (j + gap < s.length()) result.append(s.charAt(j + gap));
            }
        }
        return result.toString();
    }
}