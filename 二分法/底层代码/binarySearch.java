package 二分法.底层代码;

public class binarySearch{
    public binarySearch(){
    }
    public static int  binarySearch(int[] a, int target){
        int N;
        int i=0,j=a.length-1;
        while(i<=j){//i<j会漏掉m=i或m=j的情况
            int m=i+j>>1;//int m=(i+j)/2会使得结果在目标数据在数组偏右边时求到的索引爆int，应对符号位改变
            if(target<a[m]){
                j=m-1;
            }else if(target>a[m]){
                i=m+1;
            }else{
                return m;
            }
        }
        System.out.println(i);
        return -1;//若未找到，则说明目标值比a[i]大，i就是最合适的插入索引
//        return -1;
    }
    public  int  binarySearchAlternative(int[] a,int target){
        int i=0,j=a.length;//第一处改动,j一定不是查找目标，j仅仅是边界
        while(i<j){//第二处改动。因此i必须小于j
            int m=i+j>>1;//int m=(i+j)/2会使得结果在目标数据在数组偏右边时求到的索引爆int，应对符号位改变
            if(target<a[m]){
                j=m;//第三处改动，j必定不是查找目标
            }else if(target>a[m]){
                i=m+1;
            }else{
                return m;
            }
        }
        return -1;
    }
    public static int binarySearch3(int[] a,int target){
        /*
        * 优点循环内平均比较次数减少了，但失去最好情况0(1),在数组比较小时，优势不明显*/
        int i=0,j=a.length;
        while(1<j){//j肯定不是目标索引
            int m=i+j>>1;
            if(target<a[m]){
                j=m;
            }else{
                i=m;//i可能是目标索引，因此不能+1；
            }
        }
        if(a[i]==target){
            return i;
        }
        return -1;
    }
    public static int  binarySearch1(int[] a, int target){
        int N;
        int i=0,j=a.length-1;
        while(i<=j){//i<j会漏掉m=i或m=j的情况
            int m=i+j>>1;//int m=(i+j)/2会使得结果在目标数据在数组偏右边时求到的索引爆int，应对符号位改变
            if(target<a[m]){
                j=m-1;
            }else if(target>a[m]){
                i=m+1;
            }else{
                return m;
            }
        }
        System.out.println(i);
        return -(i+1);//若未找到，则说明目标值比a[i]大，i就是最合适的插入索引
//        return -1;
    }
    public static int  binarySearchLeftmost1(int[] a, int target){
        int N;
        int i=0,j=a.length-1;
        int candidate=-1;
        while(i<=j){//i<j会漏掉m=i或m=j的情况
            int m=i+j>>1;//int m=(i+j)/2会使得结果在目标数据在数组偏右边时求到的索引爆int，应对符号位改变
            if(target<a[m]){
                j=m-1;
            }else if(target>a[m]){
                i=m+1;
            }else{
                //记录候选位置
                candidate=m;
                j=m-1;
            }
        }
        return candidate;
//        return -1;
    }
}
    
