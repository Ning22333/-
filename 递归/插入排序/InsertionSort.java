package 递归.插入排序;

import java.util.Arrays;

public class InsertionSort {
    public static void Sort(int[] a) {
        Insertsort(a,1);
    }
    public static void Insertsort(int[] a, int low) {
        if(low==a.length){
            return;
        }
        int t=a[low];
        int i=low-1;
        while(i>=0 && a[i]>t){
            a[i+1]=a[i];
            i--;
        }
        a[i+1]=t;
        Insertsort(a,low+1);
    }
    public static void main(String[] args) {
        int[] a = {1,2,5,4,7,6,3,8,9};
        Sort(a);
        System.out.println(Arrays.toString(a));}
}
