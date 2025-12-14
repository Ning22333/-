package 链表.单向链表.底层代码;

import java.util.Iterator;
import java.util.function.Consumer;

public class SinglyLinkedListSentinel implements Iterable<Integer>{
    private Node head=new Node(666,null);//带哨兵的头指针
    //添加static的时机：类内部的元素与外界无关联就可加上static
    private static class Node{
        int value;
        Node next;
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void addFirst(int value) {
//        //2.代码合并
//        //1.代码分析情况
////        //1.链表为空
////        head = new Node(value,null);
//        //2.链表非空
//        head=new Node(value,head);//先把新创建的结点指向最后一个结点防止地址信息丢失，再将头指针指向新创建的结点
        //改动五：合并，由于insert改变后作业包括addFirst
        insert(0,value);
    }
    public void loop1(Consumer<Integer> consumer){
        //改动三
        Node p=head.next;
        while(p!=null){
            consumer.accept(p.value);
            p=p.next;
        }
    }
    public void loop2(){
        //改动三
        Node p=head.next;
        for(;p!=null;p=p.next){
            System.out.println(p.value);
        }
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
//          改动三：
            Node p=head.next;
            @Override
            public Integer next() {
                int v=p.value;
                p=p.next;
                return v;
            }
            @Override
            public boolean hasNext() {
                return p!=null;
            }
        };
    }
    private  Node findLast(){
        //改动二
//        if(head==null){
//            return null;
//        }
        Node p;
        for (p=head;p.next!=null;p=p.next){
        }
        return p;
    }
    public void addLast(int value){
        Node p=findLast();
        //改动一
//        if(p==null){
//            addFirst(value);
//            return;
//        }
        Node newNode=new Node(value,null);
        p.next=newNode;
    }
    public Node findNode(int index){
        int i=-1;//0修改1为-1表示哨兵
        //改动三：
        //改动三忽略了哨兵结点的情况
        //改动四，因此p应该指向哨兵
        for(Node p=head/*head.next*/;p!=null;p=p.next,i++){
            if(i==index){
                return p;
            }
        }
        return null;
    }
    public int get(int index){
        Node node=findNode(index);
        if(node==null){
            throw IllegalIndex(index);
        }
        return node.value;

    }
    public void insert(int index,int value){
        //考虑链表为空
        //改动四：
//        if (index==0){
//            addFirst(value);
//            return;
//        }
        //若是从索引0位置插入，原代码未考虑哨兵为-1的情况，需要修改findNode
        Node prev=findNode(index-1);
        //考虑索引不存在
        if(prev==null){
            throw IllegalIndex(index);
        }
        prev.next=new Node(value,prev.next);
    }
    public void removeFirst(){
        //改动六：
        //由于哨兵存在，不需要谈论头指针为空的情况
//        if(head==null){
//            throw IllegalIndex(0);
//        }
//        head=head.next;
        remove(0);
    }
    public void remove(int index){
        //index为0时单独谈论
        //由于哨兵结点的存在且findNode在之前已经改造完成因此index为零得情况不用单独谈论
//        if(index==0){
//            removeFirst();
//            return;
//        }
        Node prev=findNode(index-1);
        //没有前继结点时
        if(prev==null){
            throw IllegalIndex(index);
        }
        //索引不存在时
        if(prev.next==null){
            throw IllegalIndex(index);
        }
        Node removee=prev.next;
        prev.next=removee.next;
    }
    public IllegalArgumentException IllegalIndex(int index){
        return new IllegalArgumentException(
                String.format("index [%d] 不合法%n",index)
        );
    }
}
