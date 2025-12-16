package 链表.单向链表.结点删除;
import 链表.单向链表.链表反向.ListNode;

public class removed {
    static public ListNode removeelement(ListNode p, int val) {
        if(p==null){
            return null;
        }
        if(p.val==val){
            return removeelement(p.next,val);
        }else{
            p.next = removeelement(p.next,val);
            return p;
        }
    }
    //删除倒数第index个结点
    static public ListNode removebyreindex1(ListNode head,int index){
        ListNode n1=new ListNode(0,head);
        resursion(n1,index);
        return n1.next;

    }
    static public int resursion(ListNode p,int index){
        if(p==null){
            return 0;
        }
        int t=resursion(p.next,index);
        if(t==index){
            p.next=p.next.next;
        }
        return t+1;
    }
    static public ListNode removebyreindex(ListNode head,int index){
        ListNode n1=new ListNode(0,head);
        ListNode s1=n1;
        ListNode s2=n1;
        for(int i=0;i<index+1;i++){
            s1=s1.next;
        }
        while(s1!=null){
            s1=s1.next;
            s2=s2.next;
        }
        s2.next=s2.next.next;
        return n1.next;
    }
    //链表去重
    static public ListNode deleteDuplicates1(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode p2=head;
        ListNode p1;
        while((p1=p2.next)!=null){
            if(p1.val==p2.val){
                p2.next=p2.next.next;
            }else{
                p2=p2.next;
            }
        }
        return head;
    }
    //2.
    static public ListNode deleteDuplicates(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        if(head.val==head.next.val){
            return deleteDuplicates(head.next);
        }else{
            head.next=deleteDuplicates(head.next);
            return head;
        }
    }
    //链表删除出现多次的元素
    static public ListNode deleteallDuplicates1(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        if(head.val==head.next.val){
            ListNode x=head.next.next;
            while(x!=null&&x.val==head.val){
                x=x.next;
            }
            return deleteallDuplicates(x);
        }else{
            head.next=deleteallDuplicates(head.next);
            return head;
        }
    }
    //2
    static public ListNode deleteallDuplicates(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode s=new ListNode(0,head);
        ListNode p1=head;
        ListNode p2,p3;
        while((p2=p1.next)!=null && (p3=p2.next)!=null){
            if(p3.val==p2.val){
                while((p3=p3.next)!=null&&p3.val==p2.val){

                }
                p1.next=p3;
            }else{
                p1=p1.next;
            }
        }
        return s.next;
    }
    public static void main(String[] args) {
        ListNode ls=new ListNode(8,null);
        ls.next=new ListNode(7,null);
        ls.next.next=new ListNode(7,null);
        ls.next.next.next=new ListNode(7,null);
        ls.next.next.next.next=new ListNode(5,null);
        System.out.println(ls);
//        System.out.println(removeelement(ls,7));
        System.out.println(deleteallDuplicates(ls));
        System.out.println(removebyreindex(ls,2));
    }
}
