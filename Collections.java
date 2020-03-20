import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Collections {
    private static void ListToMap(ArrayList<String> array_data) {
        HashMap<Integer, String> map_data = new HashMap<Integer, String>();
        for (int j = 0; j<array_data.size(); j++){
            map_data.put(j+1, array_data.get(j));
        }
        System.out.println("List To Map: "+ map_data);
    }
    private static void ListToSet(ArrayList<String> array_data) {
        HashSet<String> set_data = (HashSet<String>) array_data.stream().collect(Collectors.toSet());
        System.out.println("List To Set: "+ set_data);
    }
    public static void main(String[] args) {
        ArrayList<String> array_data = new ArrayList<String>();
        array_data.add("m");
        array_data.add("a");
        array_data.add("d");
        array_data.add("a");
        array_data.add("m");
        System.out.println("Array list: "+ array_data);
        ListToMap(array_data);
        ListToSet(array_data);
    }

}
