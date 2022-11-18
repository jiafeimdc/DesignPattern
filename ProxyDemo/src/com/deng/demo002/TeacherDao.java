package com.deng.demo002;

public class TeacherDao implements ITeacherDao{

    @Override
    public void teach() {
        System.out.println("老师上课！！");
        
    }

    @Override
    public void sayHello(String str) {
       System.out.println(str);
        
    }
    
}
