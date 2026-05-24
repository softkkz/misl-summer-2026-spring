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
	public String hello(@PathVariable String name) {
		return "Hello, " + name + "!"; // OK
	}
	
	@PostMapping("/post")
	public String post(@RequestBody String name) {
		return name + " Added. (POST)"; // Created
	}
	
	@PutMapping("/put")
	public String put(@RequestBody String name) {
		return name + " Updated. (PUT)"; // OK, No Content
	}
	
	@PatchMapping("/patch")
	public String patch(@RequestBody String name) {
		return name + " Updated. (PATCH)"; // OK, No Content
	}
	
	@DeleteMapping("/delete")
	public String delete() {
		return "Deleted."; // OK
	}
}

