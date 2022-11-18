package com.deng;

public class Mgr06 {
    private static volatile   Mgr06 INSTANCE;
    private Mgr06(){

    }
    public static  Mgr06 getInstance(){
        if(INSTANCE==null){  //双重检查单例写法
            synchronized(Mgr06.class){  //拿到锁别进不来啦，再判断是否为空，这里判断是防止在拿到锁前已经有一个线程创建了对象
                if(INSTANCE==null){
                    try {
                        Thread.sleep(1);
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                    INSTANCE=new Mgr06();
                }

            }
        }
        return  INSTANCE;
    }

    //不同对象的哈希码是不同的
    //测试线程不安全
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Mgr06.getInstance().hashCode());
                }
            }).start();
        }
    }
}
