package 链表.双向链表.底层代码;

import java.util.Iterator;

public class DoublyLinkedListSentinel implements Iterable<Integer> {
    static class Node {
        Node prev;
        Node next;
        int value;
        public Node(Node prev, int value, Node next) {
            this.prev = prev;//上一个结点指针
            this.next = next;//下一个结点指针
            this.value = value;
        }
    }
    private Node head;//头哨兵
    private Node tail;//尾哨兵
    public IllegalArgumentException illegalIndex(int index) {
        throw new IllegalArgumentException(
                String.format("index [%d] 不合法%n",index)
        );
    }
    public DoublyLinkedListSentinel() {
        head = new Node(null,666,null);
        tail=new Node(null,888,null);
        head.next=tail;
        tail.prev=head;
    }
    public Node findNode(int index){
        int i=-1;
        for(Node p=head;p!=tail;p=p.next,i++){
            if(i==index){
                return p;
            }
        }
        return null;
    }
    public void  addFirst(int value){
        insert(0,value);
    }
    public void removeFirst(){
        remove(0);
    }
    public void addLast(int value){
        Node newNode=new Node(tail.prev,value,tail);
        Node prev=tail.prev;
        prev.next=newNode;
        tail.prev=newNode;
    }
    public void removeLast(){
        Node removed=tail.prev;
        if(removed==head){
            throw illegalIndex(0);
        }
        Node prev=removed.prev;
        tail.prev=prev;
        prev.next=tail;
    }
    public void insert(int index, int value){
        Node prev=findNode(index-1);
        if(prev==null){
            throw illegalIndex(index);
        }
        Node next=prev.next;
        Node newNode=new Node(prev,value,prev.next);
        prev.next=newNode;
        next.prev=newNode;
    }
    public void remove(int index){
        Node prev=findNode(index-1);
        //包含了删除的结点是头结点的情况
        if(prev==null){
            throw illegalIndex(index);
        }
        Node removed=prev.next;
        //删除的结点是尾结点的情况
        if(removed==tail){
            throw illegalIndex(index);
        }
        prev.next=removed.next;
        removed.next.prev=prev;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p=head;
            @Override
            public boolean hasNext() {
                p=p.next;
                return p!=tail;
            }

            @Override
            public Integer next() {
                return p.value;
            }
        };
    }
}
