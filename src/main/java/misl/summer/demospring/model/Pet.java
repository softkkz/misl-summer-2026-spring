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
	
	private int id;
	private String name;
	private String birthDate;
	private String category;
	private String owner;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	
	
	
	
	
}