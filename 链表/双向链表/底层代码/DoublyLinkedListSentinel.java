package 链表.双向链表.底层代码;

public class DoublyLinkedListSentinel {
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
    public DoublyLinkedListSentinel() {
        head = new Node(null,666,null);
        tail=new Node(null,888,null);
        head.next=tail;
        tail.prev=head;
    }
}
