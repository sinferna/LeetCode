// Last updated: 2/26/2026, 9:38:38 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> seen = new HashSet<>();
4            for (int i = 0; i < nums.length; i++) {
5                if (seen.contains(nums[i])) {
6                    return true;
7                }
8                seen.add(nums[i]);
9            }
10            return false;
11    }
12}