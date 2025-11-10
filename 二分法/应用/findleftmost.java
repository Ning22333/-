package 二分法.应用;
import 二分法.底层代码.binarySearchBasic;
import 二分法.底层代码.binarySearch;
public class findleftmost {
    public static void main(String[] args) {
        int[] a={1,2,4,4,4,5,6,7};
        binarySearchBasic.assertEquals(0,binarySearch.binarySearchLeftmost1(a,1));
        binarySearchBasic.assertEquals(1,binarySearch.binarySearchLeftmost1(a,2));
        binarySearchBasic.assertEquals(2,binarySearch.binarySearchLeftmost1(a,4));
        binarySearchBasic.assertEquals(5,binarySearch.binarySearchLeftmost1(a,5));
        binarySearchBasic.assertEquals(6,binarySearch.binarySearchLeftmost1(a,6));
        binarySearchBasic.assertEquals(7,binarySearch.binarySearchLeftmost1(a,7));
        binarySearchBasic.assertEquals(0,binarySearch.binarySearchLeftmost1(a,1));
        binarySearchBasic.assertEquals(-1,binarySearch.binarySearchLeftmost1(a,0));
        binarySearchBasic.assertEquals(-1,binarySearch.binarySearchLeftmost1(a,3));
        binarySearchBasic.assertEquals(-1,binarySearch.binarySearchLeftmost1(a,8));
        //找最右边的索引只需令i=m+1即可;
        binarySearchBasic.assertEquals(0,binarySearch.binarySearchLeftmost2(a,1));
        binarySearchBasic.assertEquals(1,binarySearch.binarySearchLeftmost2(a,2));
        binarySearchBasic.assertEquals(2,binarySearch.binarySearchLeftmost2(a,4));
        binarySearchBasic.assertEquals(5,binarySearch.binarySearchLeftmost2(a,5));
        binarySearchBasic.assertEquals(6,binarySearch.binarySearchLeftmost2(a,6));
        binarySearchBasic.assertEquals(7,binarySearch.binarySearchLeftmost2(a,7));
        binarySearchBasic.assertEquals(0,binarySearch.binarySearchLeftmost2(a,1));
        binarySearchBasic.assertEquals(0,binarySearch.binarySearchLeftmost2(a,0));
        binarySearchBasic.assertEquals(2,binarySearch.binarySearchLeftmost2(a,3));
        binarySearchBasic.assertEquals(8,binarySearch.binarySearchLeftmost2(a,8));
    }
}
