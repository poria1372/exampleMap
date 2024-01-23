import java.util.Map;
import java.util.Scanner;

public  class CreateMap {

    public static void createMap(Map<String,Integer> map){
        String s = "hello pouria karimi hello pouria is it is not non if is";
        String [] tokens = s.split(" ");
        for (String ss : tokens){
            String word = ss.toUpperCase();
            if (map.containsKey(word)){
                int count = map.get(word);
                map.put(word,count +1);
            }else {
                map.put(word,1);
            }
        }
    }



}
