package com.deng.demo002;

public class App {

    //动态代理
    public static void main(String[] args) {
        ITeacherDao teacherDao=new TeacherDao();

        ProxyFactor factor=new ProxyFactor(teacherDao);
        ITeacherDao proxyInObject=(ITeacherDao) factor.getProxyInstance();
        proxyInObject.teach();
        proxyInObject.sayHello("你好");
    }
}
