package com.example.commentService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.commentService.model.Comment;
import com.example.commentService.service.iCommentService;


@RestController
public class CommentCotroller {
	@Autowired
	iCommentService service;
	
	@Autowired
	RestTemplate template;
	
	
	@GetMapping("/getAll")
	public List<Comment> getAll(){
		return service.getAll();
	}
	@GetMapping("/getBy/Commenter/{commenter}")
	public ResponseEntity<List<Comment>> findByCommenter(@PathVariable("commenter") String commenter){
		return new ResponseEntity<List<Comment>>(service.getByCommenter(commenter), HttpStatus.OK);
	}
	
	
	@GetMapping("/getBy/Cid/{cid}")
	public List<Comment> findById(@PathVariable("cid") Integer cid){
		return service.getByCid(cid);
	}
	@GetMapping("/getBy/Pid/{pid}")
	public List<Comment> findByPId(@PathVariable("pid") Integer pid){
		return service.getByPid(pid);
	}
	
	@DeleteMapping
	public String deleteComment(Comment comment) {
		return service.deleteComment(comment);
	}
	@PostMapping("/addComment")
	public Comment insertComment(Comment c) {
		return service.addComment(c);
	}


}
