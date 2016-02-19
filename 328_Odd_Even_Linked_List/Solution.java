package com.test;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return head;
        } else {
            ListNode odd = head;
            ListNode evenHead = head.next;
            ListNode even = evenHead;
            
            ListNode flag = evenHead;
            int i = 0;
            while(flag.next != null){
                flag = flag.next;
                
                if(i == 0){
                    odd.next = flag;
                    odd = odd.next;
                    i = 1;
                } else if(i == 1){
                    even.next = flag;
                    even = even.next;
                    i = 0;
                }
            }
            odd.next = evenHead;
            even.next = null;
            return head;
        }
    }

    class ListNode {
    	int val;
   	 	ListNode next;
   	 	ListNode(int x) { val = x; }
    }
}	

