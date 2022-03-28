package com.example.commentService.service;

import java.util.List;
import java.util.Optional;

import com.example.commentService.model.Comment;

public interface iCommentService {
	public Comment addComment(Comment comment);
	public String deleteComment(Comment comment);
	public List <Comment> getAll();
	public List <Comment> getByCommenter(String commenter);
	public List<Comment> getByCid(int cid);
	public List <Comment> getByPid(int pid);

}
