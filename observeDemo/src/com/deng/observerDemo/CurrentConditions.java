package com.deng.observerDemo;

public class CurrentConditions implements Observer{
    private float temp;
    private float hum;

    private float press;
    

    //在更新后直接进行输出
    public void update(float temp,float hum,float press){
       this.temp=temp;
       this.hum=hum;
       this.press=press;
       display();
    }

    public void display(){
        System.out.println("temp:"+temp+"");
        System.out.println("hum:"+hum+"");
        System.out.println("press:"+press+"");
    }
    
}
