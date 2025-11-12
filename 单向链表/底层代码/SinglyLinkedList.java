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
}

