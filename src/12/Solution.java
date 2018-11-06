class Solution {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        String thousand[] = {"", "M", "MM", "MMM"};
        result.append(thousand[num / 1000]);
        
        String hundred[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        result.append(hundred[num % 1000 / 100]);
        
        String ten[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        result.append(ten[num % 100 / 10]);
        
        String one[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        result.append(one[num % 10]);
        
        return result.toString();
    }
}