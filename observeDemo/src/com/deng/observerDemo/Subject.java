package com.deng.observerDemo;

public interface Subject {
    //注册
    void registerObserver(Observer observer);

    //移除
    void remove(Observer observer);

    //遍历通知所有人
    void notifyObserver();
}
