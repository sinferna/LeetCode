// Last updated: 2/26/2026, 9:30:19 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashMap<Integer, Integer> seen = new HashMap<>();
4            for (int i = 0; i < nums.length; i++) {
5                if (seen.containsKey(nums[i])) {
6                    return true;
7                }
8                seen.put(nums[i], i);
9            }
10            return false;
11    }
12}