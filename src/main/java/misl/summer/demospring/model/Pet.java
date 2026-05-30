package misl.summer.demospring.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Pet {

	public Pet() {
		
	}
	
	public Pet(Integer id, String name, String birthDate, String category, PetOwner owner) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.category = category;
		this.owner = owner;
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String birthDate;
	private String category;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private PetOwner owner;
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
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
	
	public PetOwner getOwner() {
		return owner;
	}
	
	public void setOwner(PetOwner owner) {
		this.owner = owner;
	}
	
	
	
	
	
	
	
}