package com.deng;

//懒汉式单例,线程不安全
public class Mgr03 {

    private static  Mgr03 INSTANCE;

    private Mgr03(){

    }
    public static Mgr03 getInstance(){
        if(INSTANCE==null){
            try {
                  Thread.sleep(1);
            }catch (Exception ex){
                ex.printStackTrace();
            }
            INSTANCE=new Mgr03();
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
                    System.out.println(Mgr03.getInstance().hashCode());
                }
            }).start();
        }
    }

}
