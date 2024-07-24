package com.gustavo.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.workshopmongo.domain.User;
import com.gustavo.workshopmongo.dto.UserDTO;
import com.gustavo.workshopmongo.services.UserServices;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@Autowired
	private UserServices services; 
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		List<User> list =services.findAll();
		List<UserDTO> listDto = list.stream()
				.map(x -> new UserDTO(x))
				.collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
}
