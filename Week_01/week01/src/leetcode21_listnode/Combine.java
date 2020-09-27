package leetcode21_listnode;

class Combine{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        else if (l2 == null) return l1;
        else if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }    

    }
	public static void main(String[] args) {
		Combine mergeTwoLists = new Combine();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(3);
		ListNode l6 = new ListNode(4);
		l4.next = l5;
		l5.next = l6;
		ListNode combine=mergeTwoLists.mergeTwoLists(l1, l4);
		while(combine!=null) {
			System.out.print(combine.val+" ");
			combine = combine.next;
		}
		
	}
}