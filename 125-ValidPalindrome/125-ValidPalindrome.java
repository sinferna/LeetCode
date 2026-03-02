// Last updated: 3/1/2026, 6:10:46 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        String letters = s.toLowerCase();
4        String regex = "[^a-z0-9]";
5        letters = letters.replaceAll(regex, "");
6
7        for (int i = 0; i < letters.length() / 2; i++) {
8            int j = letters.length() - 1 - i;
9            if (letters.charAt(j) != letters.charAt(i)) {
10                return false;
11            }
12        }
13        return true;
14    }
15}