package simpleFactory;

public class Main {
    public static void main(String[] args) {
        Coffee amer=new amerCoffee();
        Coffee brit=new britCoffee();
        amer.name();
        brit.name();
    }
}
