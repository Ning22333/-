package 单向链表.底层代码;

public class test {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.loop1(element->{
            System.out.println(element);
        });
        System.out.println("------------------------");
        list.loop2();
        System.out.println("------------------------");
        for(Integer i : list) {
            System.out.println(i);
        }
    }
}
