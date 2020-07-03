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
        ListNode ln = new ListNode();
         ListNode l=ln;
        int sum=0;
        int ca=0;
        while(l1!=null || l2!=null)
        {
             if(l1==null)l1=new ListNode();
            if(l2==null)l2=new ListNode();
            sum = l1.val + l2.val+ca;
            ln.val=sum%10;
            ca=sum/10;
            l1=l1.next;l2=l2.next;
            ln.next=new ListNode();
            if(l1!=null || l2!=null)
            ln=ln.next;
            else
                ln.next=null;
        }
       if(ca>0) {ln.next=new ListNode();ln.next.val=ca;ln.next.next=null;}
        return l;
    }
}
