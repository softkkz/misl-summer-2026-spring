package misl.summer.demospring.model;

public class Pet {

	public Pet() {
		
	}
	
	public Pet(int id, String name, String birthDate, String category, String owner) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.category = category;
		this.owner = owner;
		
	}
	
	public int id;
	public String name;
	public String birthDate;
	public String category;
	public String owner;
	
}