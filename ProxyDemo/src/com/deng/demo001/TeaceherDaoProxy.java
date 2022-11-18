package com.deng.demo001;
public class TeaceherDaoProxy implements ITeacherDao{
    private ITeacherDao targDao;

    public TeaceherDaoProxy(ITeacherDao target){
        this.targDao=target;
    }

    @Override
    public void teach() {
       System.out.println("开始代理。。。");
       targDao.teach(); 
       System.out.println("代理结束。。。");
        
    }
}
