import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DisplayMap {

    public static void displayMap(Map<String ,Integer> map){
        Set<String> keys = map.keySet();
        TreeSet<String> sortedSet = new TreeSet<>();
        System.out.printf("%nMap contains:%nkey\t\tvalue%n");
        for (String key : sortedSet){
            System.out.printf("%-10s%10s%n",key,map.get(key));
        }
        System.out.printf("%nsize : %d%nisEmpty : %b%n", map.size(),map.isEmpty());

    }
}
