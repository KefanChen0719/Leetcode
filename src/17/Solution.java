class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<String>();
        List<String> result = Arrays.asList("");
        String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0; i < digits.length(); i++) {
            List<String> newResult = new ArrayList<String>();
            String chars = map[Character.getNumericValue(digits.charAt(i))];
            for (String curr : result) {
                for (char c : chars.toCharArray()) {
                    newResult.add(curr + c);
                }
            }
            result = newResult;
        }
        return result;
    }
}