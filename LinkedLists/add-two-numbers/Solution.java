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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode ans=new ListNode(-1);
        ListNode head=ans;
        int carry=0;
        while(l1!=null && l2!=null)
        {
            int num1=l1.val;
            int num2=l2.val;
            ListNode t= new ListNode((num1+num2+carry)%10);
            carry=(num1+num2+carry)/10;
            ans.next=t;
            ans=ans.next;
            l1=l1.next;
            l2=l2.next;
        }
        
        while(l1!=null)
        {
            int num1=l1.val;
            // int num2=l2->val;
            ListNode t= new ListNode((num1+carry)%10);
            carry=(num1+carry)/10;
            ans.next=t;
            ans=ans.next;
            l1=l1.next;
        }
        
        while(l2!=null)
        {
            int num2=l2.val;
            // int num2=l2->val;
            ListNode t= new ListNode((num2+carry)%10);
            carry=(num2+carry)/10;
            ans.next=t;
            ans=ans.next;
            l2=l2.next;
        }
        while(carry!=0)
        {
            ListNode t= new ListNode((carry)%10);
            carry=(carry)/10;
            ans.next=t;
            ans=ans.next;
        }
        
        
        return head.next;
    }
}