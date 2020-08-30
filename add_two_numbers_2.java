class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        int carrier = 0;
        while(l1 != null | l2 != null | carrier == 1){
            int l1_val;
            int l2_val;
            if (l1 == null){
                l1_val =0;
            } else{
                l1_val = l1.val;
                l1 = l1.next;
            }
            if (l2 == null){
                l2_val =0;
            } else{
                l2_val = l2.val;
                l2 = l2.next;
            }        
            int sum = l1_val+l2_val+carrier;
            carrier = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }
        return head.next; 
    }
}
