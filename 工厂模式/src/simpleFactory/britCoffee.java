package simpleFactory;

public class britCoffee implements Coffee{
    @Override
    public void name() {
        System.out.println("你选择了英式咖啡");
    }
}
