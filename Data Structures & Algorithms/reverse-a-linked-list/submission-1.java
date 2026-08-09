class Solution {
    public ListNode rev(ListNode prev,ListNode curr){
       
        if(curr==null) return prev;
        ListNode nxt=curr.next;
        curr.next=prev;
        return rev(curr,nxt);
        }
    
    public ListNode reverseList(ListNode head) {
        return rev(null,head);
        
    }
}
