
public class Player {
	private int Id;
	private String name;
	

	public Player(int id, String name) {
		Id = id;
		this.name = name;
		
		
		
		
	}


	@Override
	public String toString() {
		return "Player [Id=" + Id + ", name=" + name + "]";
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

}
