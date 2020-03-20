import java.awt.*;
import java.util.*;

public class collect {
    public void m()
    {
       ArrayList<String> a=new ArrayList<String>();
        a.add("Ramya");
        a.add("krishna");
        a.add("kannan");
        a.add("queen");
        a.add("majesty");
       System.out.println(a);
       HashMap<Integer,String> m=new HashMap<Integer, String>();
       for(String s:a)
       {
           m.put(a.indexOf(s),s);
       }
        System.out.println(m);
        HashSet<String> set=new HashSet<>(m.values());
        System.out.println(set);


        
    }

    public static void main(String[] args) {

        collect c=new collect();
        c.m();
        
    }
    
}
