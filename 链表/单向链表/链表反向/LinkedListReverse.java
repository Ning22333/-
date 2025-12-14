package 链表.单向链表.链表反向;
import 链表.单向链表.底层代码.SinglyLinkedList;

public class LinkedListReverse {
    //方法一：创建新链表完成反转
    public static ListNode reverse(ListNode head) {
        ListNode n1=null;
        while(head!=null){
            n1=new ListNode(head.val,n1);
            head=head.next;
        }
        return  n1;
    }
    public static void main(String[] args) {
        ListNode n1=null;
        ListNode n2=new ListNode(5,n1);
        ListNode n3=new ListNode(4,n2);
        ListNode n4=new ListNode(3,n3);
        ListNode n5=new ListNode(2,n4);
        ListNode n6=new ListNode(1,n5);
        System.out.println(n6);
        ListNode n7=new LinkedListReverse().reverse(n6);
        System.out.println(n7);
    }
}
