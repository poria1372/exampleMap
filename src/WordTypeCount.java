import java.util.HashMap;
import java.util.Map;

public class WordTypeCount {
    public static void main(String[] args) {
        Map<String,Integer> myMap = new HashMap<>();
        CreateMap.createMap(myMap);
        DisplayMap.displayMap(myMap);
    }
}
