// Last updated: 3/19/2026, 6:42:22 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode result = new ListNode(0);
14        ListNode current = result;
15        while (list1 != null && list2 != null) {
16            if (list1.val < list2.val) {
17                current.next = list1;
18                list1 = list1.next;
19            } else {
20                current.next = list2;
21                list2 = list2.next;
22            }
23            current = current.next;
24        }
25        current.next = list1 == null ? list2 : list1;
26        return result.next;
27    }
28}