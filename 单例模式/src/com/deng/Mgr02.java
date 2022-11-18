package com.deng;

public class Mgr02 {
    //保证Mgr01在内存中只有一个实例

    private  static final  Mgr02 INSTANCE;//使其一旦赋值就不可改变

    static {
        INSTANCE=new Mgr02();
    }

    private Mgr02() {//将构造方法改成private 防止用户去new
    }

    public static Mgr02 getInstance(){
        return  INSTANCE;
    }


    //来看看是不是只有一个实例
    public static void main(String[] args) {
        Mgr02 m1=Mgr02.getInstance();
        Mgr02 m2=Mgr02.getInstance();
        System.out.println(m1==m2);

    }
}
