package 链表.双向链表.底层代码;

public class test {
    public static void main(String[] args) {
        DoublyLinkedListSentinel list = new DoublyLinkedListSentinel();
        //----------------------头部插入
        System.out.println("头部插入");
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        for(Integer i : list) {
            System.out.println(i);
        }
        //----------------------尾部插入
        System.out.println("尾部插入");
        DoublyLinkedListSentinel list1 = new DoublyLinkedListSentinel();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        for(Integer i : list1) {
            System.out.println(i);
        }
        //-----------------------头部删除
        System.out.println("头部删除");
        list.removeFirst();
        list.removeFirst();
        for(Integer i : list) {
            System.out.println(i);
        }
        //-------------------------尾部删除
        System.out.println("尾部删除");
        list1.removeLast();
        for(Integer i : list1) {
            System.out.println(i);
        }
        //---------------------------指定删除
        System.out.println("指定删除");
        list1.remove(1);
        for(Integer i : list1) {
            System.out.println(i);
        }
    }
}
