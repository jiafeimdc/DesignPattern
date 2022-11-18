package simpleFactory02;

public class Main {
    public static void main(String[] args) {
       Coffee coffee=CofferFactory.getCar("amer");
        coffee.name();
    }
}
