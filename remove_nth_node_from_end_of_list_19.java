/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode firstPtr = head;
        ListNode secondPtr = head;
        for(int i=0;i<n;i++){
            firstPtr=firstPtr.next;
        }
        while(firstPtr!=null && firstPtr.next!=null){
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }
        if(firstPtr==null) return head.next;
        secondPtr.next= secondPtr.next.next;
        return head;
    }
}
