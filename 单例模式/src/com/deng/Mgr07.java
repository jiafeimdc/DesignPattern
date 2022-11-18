package com.deng;

public class Mgr07 {

    private Mgr07(){

    }

    private static class Mgr07Hold{
        private final static Mgr07  INSTANCE=new Mgr07();
    }

    private static Mgr07 getInstance(){
        return  Mgr07Hold.INSTANCE;
    }


    //不同对象的哈希码是不同的
    //测试线程不安全
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Mgr07.getInstance().hashCode());
                }
            }).start();
        }
    }
}
