package com.deng.demo001;
public class App {
    public static void main(String[] args) {
        ITeacherDao dao=new TeacherDao();
        TeaceherDaoProxy teaceherDaoProxy=new TeaceherDaoProxy(dao);
        teaceherDaoProxy.teach();
        
    }
}
