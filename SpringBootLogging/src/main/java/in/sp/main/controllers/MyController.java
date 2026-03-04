package in.sp.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.entities.User;
import in.sp.main.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="User REST API CRUD Operations", description = "CRUD Operations for User")
@RestController
public class MyController {

	@Autowired
	private UserService userService;

	@ApiResponse(responseCode = "201",description = "CREATED")
	@Operation(summary = "Create User", description = "REST API to Create User")
	@PostMapping("/user")
	public User addUserDetails(@RequestBody User user) {
		return userService.createUser(user);
	}

	@Operation(summary = "Fetch All User Details", description = "REST API to fetch All User Details")
	@GetMapping("/user")
	public List<User> getAllUserDetails() {
		return userService.getAllUsers();
	}

	@Operation(summary = "Fetch 1 User Details", description = "REST API to fetch 1 User Details")
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable int id) {
		User user = userService.getUserDetails(id).orElse(null);
		if (user != null) {
			return ResponseEntity.ok().body(user);
		} else {
			//return ResponseEntity.notFound().build();
			return null;
		}
	}

	@Operation(summary = "Update User", description = "REST API to Update User details")
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUserDetails(@PathVariable int id, @RequestBody User user) {
		User updatedUser = userService.updateUserDetails(id, user);
		if (updatedUser != null) {
			return ResponseEntity.ok().body(updatedUser);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@Operation(summary = "Delete User", description = "REST API to Delete User")
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable int id) {
		if (userService.deleteUser(id)) {
			return ResponseEntity.ok().body("User Deleted");
		} else {
			return ResponseEntity.ok().body("User not Deleted");
		}
	}
}
