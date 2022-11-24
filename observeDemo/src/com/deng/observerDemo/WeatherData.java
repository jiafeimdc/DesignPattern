package com.deng.observerDemo;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{


    private float temp;
    private float hum;

    private float press;
    private List<Observer> listObserver =null;

    public WeatherData(){
        listObserver=new ArrayList<>();
    }

    public float getTemp(){
        return temp;
    }

    public float getHum(){
        return hum;
    }

    public float getPress(){
        return press;
    }

    public void dataChange(){
        notifyObserver();
    }


    //数据改变就调用这个方法，这个方法会将数据进行刷新，然后通知所有的订阅者
    public void setData(float temp,float hum,float press){
        this.temp=temp;
        this.hum=hum;
        this.press=press;
        dataChange();
    }

    

    //注册一个观察者，这里就是将观察者加入集合就是注册啦 
    @Override
    public void registerObserver(Observer observer) {
        listObserver.add(observer);
        
    }

    @Override
    public void remove(Observer observer) {
       listObserver.remove(observer);
        
    }

    @Override
    public void notifyObserver() {
       for (int i = 0; i < listObserver.size(); i++) {
         listObserver.get(i).update(this.temp, this.hum, this.press);;
       }        
    }
    
}
