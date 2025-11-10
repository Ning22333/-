package 二分法.应用;
import 二分法.底层代码.binarySearch;
import java.util.Arrays;
public class insertvalue {
    public static void main(String[] args) {
        int[] a={2,5,8};
        int target=4;
        int i=binarySearch.binarySearch1(a,target);
        System.out.println(i);
        if(i<0){
            int insertvalue=Math.abs(i+1);
            int[] b=new int[a.length+1];
            System.arraycopy(a,0,b,0,insertvalue);
            b[insertvalue]=target;
            System.arraycopy(a,insertvalue,b,insertvalue+1,a.length-insertvalue);
            System.out.println(Arrays.toString(b));
        }
    }
}