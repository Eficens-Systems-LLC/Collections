import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        
        List<Integer> li = new ArrayList<>();
        li.add(34);
        li.add(16);
        li.add(54);
        li.add(23);
        li.add(54);
        
         System.out.println(li);
         
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for(int i = 0; i < li.size(); i++)
        {
            map.put(i, li.get(i));
        }
        
        System.out.println(map);
        HashSet<Integer> set = new HashSet<Integer>();
        set.addAll(li);
        System.out.println(set);
     }
}
