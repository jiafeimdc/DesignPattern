package com.deng.demo001;
public class TeacherDao implements ITeacherDao{

    @Override
    public void teach() {
        System.out.println("老师上课啦");
    }
    
}
