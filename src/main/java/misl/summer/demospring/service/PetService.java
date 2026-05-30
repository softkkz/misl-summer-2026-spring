package misl.summer.demospring.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import misl.summer.demospring.DemospringApplication;
import misl.summer.demospring.model.Pet;
import misl.summer.demospring.model.PetOwner;
import misl.summer.demospring.repository.PetOwnerRepository;
import misl.summer.demospring.repository.PetRepository;

@Service
public class PetService {

    private final DemospringApplication demospringApplication;

	@Autowired
	PetRepository petRepository;
	@Autowired
	PetOwnerRepository petOwnerRepository;

    PetService(DemospringApplication demospringApplication) {
        this.demospringApplication = demospringApplication;
    }
	
	public List<Pet> getAllPets(){
		return petRepository.findAll();
	}
	
	public Pet getPet(Integer id) throws NoSuchElementException {
		return petRepository.findById(id).orElseThrow();
	}
	
	public Pet savePet(Pet pet) {
		
		Integer petOwnerId = pet.getOwner().getId();
		if(petOwnerId != null) {
			PetOwner petOwner = pet.getOwner();
			PetOwner exisingPetOwner = petOwnerRepository.findById(petOwnerId).orElse(petOwner);
			pet.setOwner(exisingPetOwner);
		}
		
		return petRepository.save(pet);
	}
	
	public Pet updatePet(Integer id, Pet pet) {
		Pet existingPet = petRepository.findById(id).get();
		
		existingPet.setName(pet.getName());
		existingPet.setBirthDate(pet.getBirthDate());
		existingPet.setCategory(pet.getCategory());
		
		PetOwner existingPetOwner = petOwnerRepository.findById(pet.getOwner().getId()).get();
		existingPetOwner.setOwnerName(pet.getOwner().getOwnerName());
		existingPetOwner.setOwnerAddress(pet.getOwner().getOwnerAddress());
		existingPetOwner.setOwnerTel(pet.getOwner().getOwnerTel());
		existingPet.setOwner(existingPetOwner);
		
		return petRepository.save(existingPet);
		
	}
	
	public void delete(Integer id) {
		petRepository.deleteById(id);
	}
	
	public List<Pet> getPetByName(String name) {
		return petRepository.findByName(name);
	}
}
