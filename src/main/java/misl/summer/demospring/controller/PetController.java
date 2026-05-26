package misl.summer.demospring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import misl.summer.demospring.model.Pet;

@Controller
@RequestMapping("/pet")
public class PetController {
	
	ArrayList<Pet> petList;
	
	public PetController() {
		petList = new ArrayList<Pet>();
		
		Pet pet1 = new Pet(1, "BoBo", "01/05/2569", "Dog", "IT");
		Pet pet2 = new Pet(2, "Black", "12/12/2567", "Cat", "IT");
		Pet pet3 = new Pet(3, "Noppo", "20/01/2566", "Dog", "MSU");
		
		
		petList.add(pet1);
		petList.add(pet2);
		petList.add(pet3);
		
	}
	
	@GetMapping("/list")
	public ResponseEntity<ArrayList<Pet>> getPetList() {
		
		return ResponseEntity.ok(petList);
	}
	
	@GetMapping("/pet/{id}")
	public ResponseEntity<Pet> getPet(@PathVariable int id){

		for(Pet item : petList) {
			if(item.getId() == id) {
				return ResponseEntity.ok(item);
			}
		}
		
		return ResponseEntity.badRequest().build();
	}
	
	@PostMapping("/add")
	public ResponseEntity<Pet> addPet(@RequestBody Pet body){
		petList.add(body);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Pet> updatePet(@PathVariable int id, @RequestBody Pet body){
		
		Pet updatePet = null;
		
		for(Pet item : petList) {
			if(item.getId() == id) {
				
				item.setId(body.getId());
				item.setName(body.getName());
				item.setBirthDate(body.getBirthDate());
				item.setCategory(body.getCategory());
				item.setOwner(body.getOwner());
				
				updatePet = item;
			}
		}
		
		return ResponseEntity.ok(updatePet);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Pet> deletePet(@PathVariable int id){
		for(int i = 0; i < petList.size(); i++) {
			Pet item = petList.get(i);
			
			if(item.getId() == id) {
				petList.remove(i);
				return ResponseEntity.status(HttpStatus.OK).build();
			}
		}
		
		return ResponseEntity.badRequest().build();
		
	}
	
	
}
