package com.deng;

public class Mgr04 {
    private static  Mgr04 INSTANCE;
    private Mgr04(){

    }
    public static synchronized Mgr04 getInstance(){
        //加锁！！！    但是效率下降 synchronized锁定的是当前对象，
         // 但是这里是static的synchronized，所以锁定的是Mgr04.class的对象
        if(INSTANCE==null){
            try {
                Thread.sleep(1);
            }catch (Exception ex){
                ex.printStackTrace();
            }
            INSTANCE=new Mgr04();
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
                    System.out.println(Mgr04.getInstance().hashCode());
                }
            }).start();
        }
    }
}
