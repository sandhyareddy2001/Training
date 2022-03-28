package com.example.commentService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.commentService.dao.iCommentDao;
import com.example.commentService.model.Comment;


@Service
public class CommentServiceImpl implements iCommentService{
	
	@Autowired
	iCommentDao dao;

	@Override
	public Comment addComment(Comment comment) {
		// TODO Auto-generated method stub
		return dao.save(comment);
	}

	@Override
	public String deleteComment(Comment comment) {
		// TODO Auto-generated method stub
		dao.delete(comment);
		return "Comment Deleted";
	}

	@Override
	public List<Comment> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	
	@Override
	public List<Comment> getByPid(int pid) {
		// TODO Auto-generated method stub
		List <Comment> ca= dao.findAll();
		List <Comment> c= new ArrayList();
		for(Comment i:ca) {
			if (i.getPid()==pid) {
				c.add(i);
			}
		}
		return c;
	}

	@Override
	public List<Comment> getByCommenter(String commenter) {
		// TODO Auto-generated method stub
		List <Comment> ca= dao.findAll();
		List <Comment> c= new ArrayList();
		for(Comment i:ca) {
			if (i.getCommenter().equals(commenter)) {
				c.add(i);
			}
		}
		return c;
	}

	@Override
	public List <Comment> getByCid(int cid) {
		// TODO Auto-generated method stub
		List <Comment> ca= dao.findAll();
		List <Comment> c= new ArrayList();
		for(Comment i:ca) {
			if (i.getCid()==cid) {
				c.add(i);
			}
		}
		return c;
		
		
	}

}
