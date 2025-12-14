package 链表.单向链表.链表反向;
import 链表.单向链表.底层代码.SinglyLinkedList;

public class LinkedListReverse {
    //方法一：创建新链表完成反转
    public static ListNode reverse1(ListNode head) {
        ListNode n1=null;
        while(head!=null){
            n1=new ListNode(head.val,n1);
            head=head.next;
        }
        return  n1;
    }
    //方法二：创建新链表但是不会创建新节点
    static class List{
        ListNode head;
        public List(ListNode head){
            this.head=head;
        }
        public void addFirst(ListNode newNode){
            newNode.next=head;
            head=newNode;
        }
        public ListNode removeFirst(){
            ListNode removed=head;
            if(head.next!=null){
                head=head.next;
            }
            return removed;
        }
    }
    public static ListNode reverse2(ListNode head){
        List p1=new List(head);
        List p2=new List(null);
        while(true){
            ListNode removed=p1.removeFirst();
            if(removed==null){
                break;
            }
            p2.addFirst(removed);
        }
        return p2.head;
    }
    //方法三:递归方法实现链表反转
    public static ListNode reverse3(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode newHead=reverse3(head.next);
        head.next.next=head;
        head.next=null;//递归的方式对节点5进行修改，让节点5指向节点4........
        return newHead;//找到最后一个节点5
    }
    public static void main(String[] args) {
        ListNode n1=null;
        ListNode n2=new ListNode(5,n1);
        ListNode n3=new ListNode(4,n2);
        ListNode n4=new ListNode(3,n3);
        ListNode n5=new ListNode(2,n4);
        ListNode n6=new ListNode(1,n5);
        System.out.println(n6);
//        ListNode n7=new LinkedListReverse().reverse(n6);
        ListNode n7=new LinkedListReverse().reverse3(n6);
        System.out.println(n7);
    }
}
