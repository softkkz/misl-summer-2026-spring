package misl.summer.demospring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PetOwner {
	
	public PetOwner() {
		
	}
	
	public PetOwner(Integer id, String ownerName, String ownerAddress, String ownerTel) {
		this.id = id;
		this.ownerName = ownerName;
		this.ownerAddress = ownerAddress;
		this.ownerTel = ownerTel;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String ownerName;
	private String ownerAddress;
	private String ownerTel;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getOwnerAddress() {
		return ownerAddress;
	}
	
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	
	public String getOwnerTel() {
		return ownerTel;
	}
	
	public void setOwnerTel(String ownerTel) {
		this.ownerTel = ownerTel;
	}
	
}
