package com.gustavo.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.workshopmongo.domain.Post;
import com.gustavo.workshopmongo.domain.User;
import com.gustavo.workshopmongo.repository.PostRepository;
import com.gustavo.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostServices {

	@Autowired
	private PostRepository repo;
	
	public Post findBy(String id) {
	    Optional<Post> user = repo.findById(id);
	    return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
