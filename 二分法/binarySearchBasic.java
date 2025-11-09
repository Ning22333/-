package 二分法;

public class binarySearchBasic{
    public static void main(String[] args) {
        test1();
        test2();
        //------------
        test3();
        test4();
        //------------
        test5();
        test6();
    }
    public static void test1() {
        binarySearch bs=new binarySearch();
        int[] arr = {7,13,21,30,38,44,52,53,60,72,88,95};
        assertEquals(0,bs.binarySearch(arr,7));
    }
    public static void test2() {
        binarySearch bs=new binarySearch();
        int[] arr = {7,13,21,30,38,44,52,53,60,72,88,95};
        assertEquals(-1,bs.binarySearch(arr,8));
    }
    public static void test3() {
        binarySearch bs=new binarySearch();
        int[] arr = {7,13,21,30,38,44,52,53,60,72,88,95};
        assertEquals(0,bs.binarySearchAlternative(arr,7));
    }
    public static void test4() {
        binarySearch bs=new binarySearch();
        int[] arr = {7,13,21,30,38,44,52,53,60,72,88,95};
        assertEquals(0,bs.binarySearchAlternative(arr,7));
    }
    public static void test5() {
        binarySearch bs=new binarySearch();
        int[] arr = {7,13,21,30,38,44,52,53,60,72,88,95};
        assertEquals(0,bs.binarySearch3(arr,7));
    }
    public static void test6() {
        binarySearch bs=new binarySearch();
        int[] arr = {7,13,21,30,38,44,52,53,60,72,88,95};
        assertEquals(0,bs.binarySearch3(arr,7));
    }
    private static void assertEquals(int i, int target) {
        if (i==target) 
        {
            System.out.println("测试通过");
        } else {
            System.out.println("测试失败");
        }
    }
}