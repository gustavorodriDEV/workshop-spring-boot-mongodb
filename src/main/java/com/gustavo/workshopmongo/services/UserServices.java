package com.gustavo.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.workshopmongo.domain.User;
import com.gustavo.workshopmongo.dto.UserDTO;
import com.gustavo.workshopmongo.repository.UserRepository;
import com.gustavo.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserServices {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findBy(String id) {
	    Optional<User> user = repo.findById(id);
	    return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		findBy(id);
		repo.deleteById(id);
	}
	
	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(),objDTO.getEmail());
	}

}
