// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    //Approach2 TC: O(n) SC:O(n)
//     public ListNode reverseList(ListNode head) { 
        
//         //base
//         if(head == null || head.next == null)return head;
        
//         //logic
//         ListNode recurse = reverseList(head.next);
//         head.next.next = head;
//         head.next = null;
        
//         return recurse;
//     }
    //Approach TC: O(n) SC:O(1)
    public ListNode reverseList(ListNode head) {      
        ListNode tmp = null;
        ListNode nextNode = head;
        
        while(nextNode!=null){
            head = nextNode;
            nextNode = head.next;
            head.next = tmp;
            tmp = head;
        }
        return head;
    }
}