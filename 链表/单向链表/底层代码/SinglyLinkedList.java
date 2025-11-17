package 单向链表.底层代码;

import java.util.Iterator;
import java.util.function.Consumer;

public class SinglyLinkedList implements Iterable<Integer>{
    Node head=null;//头指针
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
        //2.代码合并
        //1.代码分析情况
//        //1.链表为空
//        head = new Node(value,null);
        //2.链表非空
        head=new Node(value,head);//先把新创建的结点指向最后一个结点防止地址信息丢失，再将头指针指向新创建的结点
    }
    public void loop1(Consumer<Integer> consumer){
        Node p=head;
        while(p!=null){
            consumer.accept(p.value);
            p=p.next;
        }
    }
    public void loop2(){
        Node p=head;
        for(;p!=null;p=p.next){
            System.out.println(p.value);
        }
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p=head;
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
        if(head==null){
            return null;
        }
        Node p;
        for (p=head;p.next!=null;p=p.next){
        }
        return p;
    }
    public void addLast(int value){
        Node p=findLast();
        if(p==null){
            addFirst(value);
            return;
        }
        Node newNode=new Node(value,null);
        p.next=newNode;
    }
    public Node findNode(int index){
        int i=0;
        for(Node p=head;p!=null;p=p.next,i++){
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
        if (index==0){
            addFirst(value);
            return;
        }
        Node prev=findNode(index-1);
        //考虑索引不存在
        if(prev==null){
            throw IllegalIndex(index);
        }
        prev.next=new Node(value,prev.next);
    }
    public void removeFirst(){
        if(head==null){
            throw IllegalIndex(0);
        }
        head=head.next;
    }
    public void remove(int index){
        //index为0时单独谈论
        if(index==0){
            removeFirst();
            return;
        }
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

