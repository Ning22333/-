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
        System.out.println("------------------------");
        //尾插法测试
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.loop1(element->{
            System.out.println(element);
        });
        //查找测试
        System.out.println("------------------------");
        System.out.println(list1.findNode(2));;
        System.out.println(list1.get(3));
    }
}
