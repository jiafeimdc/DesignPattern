package com.deng;

//饿汉单例  线程安全，  JVM保证只LOAD到内存一次
public class Mgr01 {
    //保证Mgr01在内存中只有一个实例

    private  static final  Mgr01 INSTANCE =new Mgr01();//使其一旦赋值就不可改变

    private Mgr01() {//将构造方法改成private 防止用户去new
    }

    public static Mgr01 getInstance(){
        return  INSTANCE;
    }


    //来看看是不是只有一个实例
    public static void main(String[] args) {
        Mgr01 m1=Mgr01.getInstance();
        Mgr01 m2=Mgr01.getInstance();
        System.out.println(m1==m2);

    }
}
