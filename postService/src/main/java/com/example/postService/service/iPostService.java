package com.example.postService.service;

import java.util.List;
import java.util.Optional;

import com.example.postService.model.CommentDto;
import com.example.postService.model.Post;

public interface iPostService {
	public List<Post> getAll();
	public Optional<Post> searchById(Integer pid);
	public String deletePost(Post post);
	public Post insertPost(Post post);
	public List<Post> searchByAuthor(String author);
	public List<CommentDto> searchCommentByPid(int pid);
	


}
