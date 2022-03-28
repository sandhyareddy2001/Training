package com.example.postService.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postService.model.CommentDto;
import com.example.postService.model.Post;
import com.example.postService.service.iPostService;

@RestController
public class PostController {
	
	@Autowired
	iPostService service;
	@GetMapping("/getAll")
	public List<Post> getAll(){
		return service.getAll();
	}
	@GetMapping("/getBy/Author/{author}")
	public ResponseEntity<List<Post>> findByAuthor(@PathVariable("author") String author){
		return new ResponseEntity<List<Post>>(service.searchByAuthor(author), HttpStatus.OK);
	}
	
	@GetMapping("/getBy/{author}")
	public String findBy(@PathVariable("author") String author){
		return author ;
	}
	@GetMapping("/getBy/Id/{pid}")
	public Optional<Post> findById(@PathVariable("pid") Integer pid){
		return service.searchById(pid);
	}

	@GetMapping("/getcomment/pid/{pid}")
	public List<CommentDto> findCommentByPid(@PathVariable("pid") Integer pid){
		return service.searchCommentByPid(pid);
	}
	
	@DeleteMapping
	public String deletePost(Post post) {
		return service.deletePost(post);
	}
	@PostMapping("/addPosts")
	public Post insertPosts(Post p) {
		return service.insertPost(p);
	}


}
