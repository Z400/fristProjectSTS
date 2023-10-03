package vianaweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vianaweb.course.entitie.User;

@RestController
@RequestMapping (value = "/users")
public class UserResouce {

	@GetMapping
	public ResponseEntity<User> findAll (){
		User u = new User (1L, "Maria", "Maria@gmail.com", "9999999", "123456");
		return ResponseEntity.ok().body(u);
	}
	
	
	
}
