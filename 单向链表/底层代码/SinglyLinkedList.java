package 单向链表.底层代码;

public class SinglyLinkedList {
    Node head=null;//头指针
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
}

