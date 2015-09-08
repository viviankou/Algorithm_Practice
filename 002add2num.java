/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode result,p_a,p_b,p_r;
        if(getLength(l1)>getLength(l2))
            result=l1;
        else
            result=l2;
        int inc=0;
        int sum=0;
        p_a = l1;
        p_b = l2;
        p_r = result;
        while(p_a!=null&&p_b!=null)
        {
            sum = p_a.val + p_b.val + inc;
            p_r.val = sum%10;
            inc = (sum>9) ? 1:0;
            p_r = p_r.next;
            p_a = p_a.next;
            p_b = p_b.next;
        }
        while(p_a!=null)
        {
            sum = p_a.val + inc;
            p_r.val = sum%10;
            inc = (sum>9) ? 1:0;
            p_a = p_a.next;
            p_r = p_r.next;
        }
        while(p_b!=null)
        {
            sum = p_b.val + inc;
            p_r.val = sum%10;
            inc = (sum>9) ? 1:0;
            p_b = p_b.next;
            p_r = p_r.next;
        }
        if(inc == 1)
        {
            p_r = result;
            while(p_r.next != null)
            {
                p_r = p_r.next;
            }
            p_r.next = new ListNode(1);
        }
        return result;
    }
    private int getLength(ListNode list)
    {
        int len = 0;
        if(list == null)
            return len;
        ListNode p = list;
        while(p!=null)
        {
            len++;
            p = p.next;
        }
        return len;
    }
}