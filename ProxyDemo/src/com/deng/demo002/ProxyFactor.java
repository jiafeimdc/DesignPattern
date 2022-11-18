package com.deng.demo002;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactor {
    //维护一个目标对象
    private Object target;


    public ProxyFactor(Object target){
        this.target=target;
    }

    public Object getProxyInstance(){

        /**
         * 这里要填三个参数
         * 第一个ClassLoader loader 指定当前目标使用的类加载器 获取加载器的方法固定
         * interfaces  目标对象的接口类型
         * 事件处理
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("jdk代理开始");
                Object returnVal= method.invoke(target, args);
                System.out.println("jdk代理结束");
                return returnVal;
            }
            
        });
    }
}
