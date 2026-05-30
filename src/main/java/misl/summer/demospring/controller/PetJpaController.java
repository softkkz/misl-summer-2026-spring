package misl.summer.demospring.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
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
import misl.summer.demospring.service.PetService;

@Controller
@RequestMapping("/jpa")
public class PetJpaController {

	@Autowired
	PetService petService;
	
	@GetMapping("/")
	public ResponseEntity<List<Pet>> getAllPets(){
		return ResponseEntity.ok(petService.getAllPets());
	}
	
	@PostMapping("/save")
	public ResponseEntity<Pet> savePet(@RequestBody Pet body){
		return ResponseEntity.ok(petService.savePet(body));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pet> getPet(@PathVariable Integer id){
		
		try {
			Pet pet = petService.getPet(id);
			return ResponseEntity.ok(pet);
		}catch(NoSuchElementException e) {
			return ResponseEntity.badRequest().build();
		}
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Pet> updatePet(@PathVariable Integer id, @RequestBody Pet body){
		return ResponseEntity.ok(petService.updatePet(id, body));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletePet(@PathVariable Integer id){
		petService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<List<Pet>> getPetByName(@PathVariable String name){
		return ResponseEntity.ok(petService.getPetByName(name));
	}
	
}
