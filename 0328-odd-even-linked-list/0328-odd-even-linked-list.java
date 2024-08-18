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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode newHead=new ListNode(head.val) ;
        ListNode first=newHead;
        ListNode secHead=new ListNode(head.next.val) ;
        ListNode second=secHead;
       
        int curr=1;
        ListNode temp=head;
        while(temp!=null){
            if(curr<=2){
                temp=temp.next;
            }else{
               
            if(curr%2 !=0){
                first.next=new ListNode(temp.val);
                first=first.next;
                temp=temp.next;

            }else{
                 second.next=new ListNode(temp.val);
                second=second.next;
                temp=temp.next;
            }

            }
            curr++;
            
        }
       first.next=secHead;
        return newHead;
        
    }
}