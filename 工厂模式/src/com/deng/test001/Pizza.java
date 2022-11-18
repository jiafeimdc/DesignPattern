package com.deng.test001;

public abstract class Pizza {

    public void setName(String name) {
        this.name = name;
    }

    //披萨的名字
    protected String name;

    //准备原材料，不同的披萨不一样，所以用抽象方法
    public abstract void prepare();

    public  void back(){
        System.out.println(name+"baking;");
    }

    public  void cut(){
        System.out.println(name+"cutting;");
    }

    public  void box(){
        System.out.println(name+"boxing" +
                ";");
    }


}
