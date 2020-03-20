import java.util.*;

class MyClass {
    public static void main(String[] args) {
        ArrayList<String> bt = new ArrayList<String>();
        bt.add("Sundar");
        bt.add("Nirav");
        bt.add("Gowtham");
        bt.add("Mahesh");
        bt.add("Nirav");
        System.out.println("List: " +bt);
        HashMap<Integer, String> map = new HashMap<>();
        for(int i = 0; i < bt.size(); i++)
        {
            map.put(i, bt.get(i));
        }
        System.out.println("HashMap: "+map);
        HashSet<String> gs = new HashSet<String>(bt);
        System.out.println("Hashset elements: " + gs);
    }
}