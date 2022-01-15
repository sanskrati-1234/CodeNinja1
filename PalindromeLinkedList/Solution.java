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
    public boolean isPalindrome(ListNode head) {
         ListNode first=head, second=head;
        while(first !=null && first.next != null){
            first=first.next.next;
            second=second.next;
        }
        second= reverse(second);
        first=head;
        while(second !=null){
            if(second.val !=first.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
    }
    ListNode reverse(ListNode head){
        ListNode temp=null,temp2=null;
        while(head != null){
            temp2=head.next;
            head.next=temp;
            temp=head;
            head=temp2;
        }
        return temp;
    }
}