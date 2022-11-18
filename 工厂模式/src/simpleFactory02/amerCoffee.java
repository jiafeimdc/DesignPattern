package simpleFactory02;

public class amerCoffee implements Coffee {

    @Override
    public void name() {
        System.out.println("你选择了美式咖啡！！");
    }
}
