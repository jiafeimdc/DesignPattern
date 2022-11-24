package com.deng.observerDemo;


//观察者接口，由观察者来实现
public interface Observer {
    //所有的订阅者都必须实现这个更新的接口
    void update(float temp,float hum,float press);
}
