package simpleFactory02;

public class CofferFactory {
    public static Coffee getCar(String type){
        if(type.equals("amer")){
            return  new amerCoffee();
        }else if(type.equals("brit")){
            return  new britCoffee();
        }else{
            return null;
        }
    }
}
