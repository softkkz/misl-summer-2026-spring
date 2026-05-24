package misl.summer.demospring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		
//		Pet pet = null;
		
//		for(int i = 0; i < petList.size(); i++) {
//			Pet item = petList.get(i);
//			
//			if(item.id == id) {
//				pet = item;
//			}
//			
//		}

		for(Pet item : petList) {
			if(item.id == id) {
				return ResponseEntity.ok(item);
			}
		}
		
		return ResponseEntity.badRequest().build();
	}
	
}
