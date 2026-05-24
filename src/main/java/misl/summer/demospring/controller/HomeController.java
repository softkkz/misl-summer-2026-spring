package misl.summer.demospring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping("/")
	public ResponseEntity<String> home() {
		String result = "Hello, MSU!";
		return ResponseEntity.ok(result);
		
	}
	
	@GetMapping("/hello/{name}")
	public ResponseEntity<String> hello(@PathVariable String name) {
		String result = "Hello, " + name;
		return ResponseEntity.ok(result); // OK
	}
	
	@PostMapping("/post")
	public ResponseEntity<String> post(@RequestBody String name) {
		String result = name + "Added. (POST)";
		return ResponseEntity.status(HttpStatus.CREATED).body(result); // Created
	}
	
	@PutMapping("/put")
	public ResponseEntity<String> put(@RequestBody String name) {
		String result = name + " Updated. (PUT)";
		return ResponseEntity.ok(result); // OK, No Content
	}
	
	@PatchMapping("/patch")
	public ResponseEntity<String> patch(@RequestBody String name) {
		String result = name + "Updated. (PATCH)";
		return ResponseEntity.ok(result); // OK, No Content
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> delete() {
		String result = "Deleted.";
		return ResponseEntity.ok(result); // OK
	}
}

