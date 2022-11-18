package com.deng;


//枚举单例
public enum Mgr08 {

    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Mgr08.INSTANCE.hashCode());
                }
            }).start();
        }
    }
}
