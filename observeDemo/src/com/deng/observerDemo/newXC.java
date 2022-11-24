package com.deng.observerDemo;

public class newXC implements Observer{
    private float temp;
    private float hum;

    private float press;
    
    public void update(float temp,float hum,float press){
       this.temp=temp;
       this.hum=hum;
       this.press=press;
       display();
    }

    public void display(){
        System.out.println("newtemp:"+temp+"");
        System.out.println("newhum:"+hum+"");
        System.out.println("newpress:"+press+"");
    }
    
}
