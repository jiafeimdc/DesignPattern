package com.deng;

public class Mgr05 {
    private static  Mgr05 INSTANCE;
    private Mgr05(){

    }
    public static  Mgr05 getInstance(){
        if(INSTANCE==null){  //通过减小代码块的方式来加锁，但是不可行
            synchronized(Mgr05.class){  //在两个线程都==null判断通过后，一个线程在释放锁之后，另外一个线程也会执行这个操作
                try {
                    Thread.sleep(1);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
                INSTANCE=new Mgr05();
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
                    System.out.println(Mgr05.getInstance().hashCode());
                }
            }).start();
        }
    }
}
