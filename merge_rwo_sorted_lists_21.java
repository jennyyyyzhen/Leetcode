/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 ==null) return l2;
        if(l2 == null) return l1;
        
        if(l1.val > l2.val){
            ListNode temp = l1;
            l1 = l2;
            l2 =temp;
        }

        ListNode head1 = l1;
        ListNode head2 = l2;
        while(head1.next!=null && head2!=null){
            if(head1.next.val<=head2.val){
                head1 = head1.next;
            } else{
                ListNode temp = head1.next;
                head1.next =head2;
                head2=head2.next;
                head1.next.next = temp;
                
            }
        }
        if(head1.next ==null && head2!=null){
            head1.next = head2;
            return l1;
        }
        return l1;
    }
}
