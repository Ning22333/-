package 递归.汉诺塔;

import java.util.LinkedList;

public class HanoiTower {
    static LinkedList<Integer> a=new LinkedList<>();
    static LinkedList<Integer> b=new LinkedList<>();
    static LinkedList<Integer> c=new LinkedList<>();
    static void init(int n){
        for(int i=n;i>=1;i--){
            a.addLast(i);
        }
    }
    /*
    * n圆盘个数
    * a原始柱子
    * b中转柱子
    * c目标柱子
    * */
    static void move(int n,LinkedList<Integer> a,LinkedList<Integer> b,LinkedList<Integer> c){
        if(n==0){
            return;
        }
        move(n-1,a,b,c);
        c.addLast(a.removeLast());
        move(n-1,b,a,c);
    }
}
