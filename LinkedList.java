import java.util.*;
public class LinkedList {

    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList();
        num.add(22);
        num.add(54);
        num.add(69);
        num.add(69);
        System.out.println("List of all numbers: " + num);
        HashMap<Integer,Integer> sun = new HashMap<Integer, Integer>();
        for(int i = 0; i < num.size(); i++)
        {
            sun.put(i, num.get(i));
        }
        System.out.println("The Hashmap is: "+sun);
        Set<Integer> hashSet = new HashSet<Integer>(num);
        System.out.println("The Hashset is: "+ hashSet);








    }

}
