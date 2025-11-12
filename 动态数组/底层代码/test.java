package 动态数组.底层代码;
import 动态数组.底层代码.DynamicArray;
public class test {
    public static void main(String[] args) {
        DynamicArray dynamicArray=new DynamicArray();
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);
        dynamicArray.add(2,5);
        for(int i=0;i<5;i++){
            System.out.println(dynamicArray.get(i));
        }
    }
}
