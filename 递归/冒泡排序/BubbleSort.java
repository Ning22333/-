package 递归.冒泡排序;

import java.util.Arrays;

public class BubbleSort {
    public static void Sort(int[] a) {
        bubble(a,a.length-1);
    }
    public static void bubble(int[] a, int j) {
        if(j==0){
            return;
        }
        int x=0;
        for(int i=0;i<j;i++){
            if(a[i]>a[i+1]){
                int temp = a[i+1];
                a[i+1] = a[i];
                a[i] = temp;
                x=i;
            }
        }
        bubble(a,x);
    }
    public static void main(String[] args) {
        int[] a = {1,2,5,4,7,6,3,8,9};
        Sort(a);
        System.out.println(Arrays.toString(a));
    }
}
