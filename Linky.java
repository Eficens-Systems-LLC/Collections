import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;



public class Linky {
	
    public static void main(String args[]) {
		
		
		//creating Array List
		List<Player> pl = new ArrayList<>();
		pl.add(new Player(1, "Ajay"));
		pl.add(new Player(2, "Sunny"));
		pl.add(new Player(3, "Java"));
		pl.add(new Player(4, "Demo"));
		
		
		
		System.out.println("ArrayListResult is:" + ' ' + pl);
		
		//Mapping to HashMap
		
		Map<Integer,String> result = pl.stream().collect(Collectors.toMap(Player::getId, Player::getName));
			
		System.out.println("HashMapResult is:" + ' ' + result);
		
		
		//Mapping to HashSet
		
		HashSet<String> result1 = new HashSet<>();
		result1.addAll(result.values());
		System.out.println("HashSet Result is:"+' '+ result1);
		
		
		
		
        
        
        
        
    
        
	
	
		
		
	
	}
	

}
