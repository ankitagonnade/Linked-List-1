// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode nextNode = head;
        ListNode curr = head;
         
        while(n>0 && nextNode.next!=null){
            nextNode = nextNode.next;
            n--;
        }
        if(n==1) return head.next; // after nextNode == null and still the difference is 1 then head element needs to be removed
        if(n>1) return null; // if n is more than the nodes in LL return null
        
        while(nextNode!=null && nextNode.next!=null){
            curr = curr.next;
            nextNode = nextNode.next;
        }
       
        curr.next = curr.next.next;
        return head;
    }
}