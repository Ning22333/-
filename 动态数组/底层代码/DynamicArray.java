package 动态数组.底层代码;

public class DynamicArray {
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
    public int get(int index){
        return array[index];
    }
}
