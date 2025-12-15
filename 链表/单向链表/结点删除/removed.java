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
    public static void main(String[] args) {
        
    }
}
