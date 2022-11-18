import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          int[] intsums=new int[]{1,2,4,5,6};
         int[] tt= Sums(intsums,8);
        System.out.println(tt[0]);
        System.out.println(tt[1]);
    }
    public static int[] Sums(int[] sums,int target){
        Map<Integer,Integer> integerMap=new HashMap<>();
        int[] result=null;
        for (int i = 0; i < sums.length; i++) {
            if(integerMap.containsKey(target-sums[i])){
                result= new int[]{integerMap.get(target-sums[i]),i};
                System.out.println("进来了");
            }
            integerMap.put(sums[i],i);
        }
        return result;
    }




}
