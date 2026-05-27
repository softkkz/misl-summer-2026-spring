package misl.summer.demospring.model;

public class PetOwner {
	
	public PetOwner() {
		
	}
	
	public PetOwner(int id, String ownerName, String ownerAddress, String ownerTel) {
		this.id = id;
		this.ownerName = ownerName;
		this.ownerAddress = ownerAddress;
		this.ownerTel = ownerTel;
	}
	
	private int id;
	private String ownerName;
	private String ownerAddress;
	private String ownerTel;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
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
