package com.deng.observerDemo;

public class Client {
    public static void main(String[] args) {
        CurrentConditions conditions=new CurrentConditions();
        WeatherData weatherData=new WeatherData();  //这个weather可以看作是商家
        weatherData.registerObserver(conditions);
        //此时再注册一个商家
        weatherData.registerObserver(new newXC());

        weatherData.setData(12, 33, 45);//商家更新了产品列表 此时在这个方法中会遍历输出注册了的买家


        
    }
}
