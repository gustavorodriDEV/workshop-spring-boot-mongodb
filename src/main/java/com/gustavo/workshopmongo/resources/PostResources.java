package com.gustavo.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.workshopmongo.domain.Post;
import com.gustavo.workshopmongo.services.PostServices;

@RestController
@RequestMapping(value = "/posts")
public class PostResources {

    @Autowired
    private PostServices services; 
    
 
    @GetMapping("/titlesearch")
    public ResponseEntity<List<Post>> findById(@RequestParam(value="text") String text) {
        text = URL.decodeParam(text);
        List<Post> list = services.findbyTitle(text);
        return ResponseEntity.ok().body(list);
    }    
}
