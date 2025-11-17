package 单向链表.底层代码;
import 单向链表.底层代码.SinglyLinkedList;
import 单向链表.底层代码.SinglyLinkedListSentinel;
public class test {
    public static void main(String[] args) {
         //不带哨兵的单链表
        //头插法
        System.out.println("不带哨兵的单链表");
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.loop1(element->{
            System.out.println(element);
        });
        System.out.println("------------------------一般循环遍历");
        list.loop2();
        System.out.println("------------------------迭代遍历");
        for(Integer i : list) {
            System.out.println(i);
        }
        System.out.println("------------------------尾插法测试");
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
        System.out.println("------------------------查找测试");
        System.out.println(list1.findNode(2));;
        System.out.println(list1.get(3));
        //插入结点
        System.out.println("------------------------插入结点");
        list1.insert(3,10);
        list1.insert(0,20);
        list1.loop1(element->{
            System.out.println(element);
        });
        //删除头结点
        System.out.println("------------------------删除头结点");
        list1.removeFirst();
        list1.loop1(element->{
            System.out.println(element);
        });
        //删除指定结点
        System.out.println("------------------------删除指定结点");
        list1.remove(1);
        list1.loop1(element->{
            System.out.println(element);
        });
//        list1.remove(6);//无上一个结点
//        list1.remove(5);//没有索引5这个结点
        //带哨兵的单链表
        System.out.println("带哨兵的单链表");
        SinglyLinkedListSentinel list2 = new SinglyLinkedListSentinel();
        list2.addFirst(1);
        list2.addFirst(2);
        list2.addFirst(3);
        list2.addFirst(4);
        list2.loop1(element->{
            System.out.println(element);
        });
        System.out.println("------------------------一般循环遍历");
        list2.loop2();
        System.out.println("------------------------迭代遍历");
        for(Integer i : list2) {
            System.out.println(i);
        }
        System.out.println("------------------------尾插法测试");
        //尾插法测试
        SinglyLinkedList list3 = new SinglyLinkedList();
        list3.addLast(1);
        list3.addLast(2);
        list3.addLast(3);
        list3.addLast(4);
        list3.loop1(element->{
            System.out.println(element);
        });
        //查找测试
        System.out.println("------------------------查找测试");
        System.out.println(list3.findNode(2));;
        System.out.println(list3.get(3));
        //插入结点
        System.out.println("------------------------插入结点");
        list3.insert(3,10);
        list3.insert(0,20);
        list3.loop1(element->{
            System.out.println(element);
        });
        //删除头结点
        System.out.println("------------------------删除头结点");
        list3.removeFirst();
        list3.loop1(element->{
            System.out.println(element);
        });
        //删除指定结点
        System.out.println("------------------------删除指定结点");
        list3.remove(1);
        list3.loop1(element->{
            System.out.println(element);
        });
        list3.remove(6);//无上一个结点
        list3.remove(5);//没有索引5这个结点
    }
}
