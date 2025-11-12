package 动态数组.底层代码;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

public class DynamicArray implements Iterable<Integer> {
    public DynamicArray(){

    };
    private int size=0;
    private int capacity=8;
    private int[] array=new int[capacity];
    public void addLast(int element){
        //第一步
//        array[size]=element;
//        size++;
        //第三步：考虑代码优化
        //addlast是add时index==size的一种具体情况，可以调用add方法
        add(size,element);

    }
    public void add(int index,int element){
        checkandgrow();
        //第一步
        //将原数组的元素索引为index开始将size-index的数据拷贝到原数组从index+1位置以后的位置
//        System.arraycopy(array,index,array,index+1,size-index);
//        array[index]=element;
//        size++;
        //第二步：考虑边界问题
        if(index>=0&&index<size){
            System.arraycopy(array,index,array,index+1,size-index);
        //第三部：代码优化，代码合并
//            array[index]=element;
//            size++;
        }
        array[index]=element;
        size++;
    }
    //扩容操作
    private void checkandgrow(){
        if(size==capacity){
            capacity=capacity+capacity>>1;
            int[] newArray=new int[capacity];
            System.arraycopy(array,0,newArray,0,size);
            array=newArray;
        }
    }
    public int get(int index){
        return array[index];
    }
    //遍历局限性：foreach仅能完成遍历操作
//    public void forEach(int index){
//        for(int i=0;i<size;i++){
//            System.out.print(array[i]);
//        }
//    }
    //解决方法：匿名内部方法
    public void foreach(Consumer<Integer> consumer){
        for(int i=0;i<size;i++){
            consumer.accept(array[i]);
        }
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int i=0;
            @Override
            public boolean hasNext() {
                return i<size;
            }

            @Override
            public Integer next() {
                return array[i++];
            }
        };
    }
    //删除元素
    public int remove(int index){
        int removed=array[index];
        System.arraycopy(array,index+1,array,index,size-index-1);
        size--;
        return removed;
    }
}
