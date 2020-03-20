import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

public class test1 {
   public  static void main(String[] args){
       List<Employee> lt = new ArrayList<>();

       lt.add(new Employee(1, "goutham"));
       lt.add(new Employee(2, "rithin"));
       lt.add(new Employee(3,"saif"));
       lt.add( new Employee(4,"rithin"));

       Map<Integer, String> map = new HashMap<>();

       for(int i =0;i<lt.size();i++)
       {

           map.put(lt.get(i).getId(),lt.get(i).getName());

       }

       System.out.println("Arraylist : " + lt);

       System.out.println("Hashmap values " + map);


        Set<String> set1 = new HashSet<>();
        map = map.entrySet().stream()
                .filter(entry -> set1.add(entry.getValue()))
                .collect(Collectors
                        .toMap(Map.Entry::getKey,Map.Entry::getValue));

       System.out.println("HashSet of Keys and values : "+map);
//       System.out.println(set1.);

     }
     }



