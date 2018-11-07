class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        int result = 0;
        int index = 0;
        for ( ; index < s.length() - 1; index++) {
            char c = s.charAt(index);
            char nextC = s.charAt(index+1);
            if (hm.get(c) < hm.get(nextC)) {
                result -= hm.get(c);
                result += hm.get(nextC);
                index++;
            }
            else result += hm.get(c);
        }
        
        if (index == s.length() - 1) result += hm.get(s.charAt(index));
        return result;
    }
}