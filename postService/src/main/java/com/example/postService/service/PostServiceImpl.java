package com.example.postService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.postService.PostFeignProxy;
import com.example.postService.dao.iPostDao;
import com.example.postService.model.CommentDto;
import com.example.postService.model.Post;
@Service
public class PostServiceImpl implements iPostService{
	
	@Autowired
	iPostDao dao;
	
	
	@Autowired
	PostFeignProxy proxy;
	@Autowired 
	RestTemplate template;
	@Override
	public List<Post> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public Optional<Post> searchById(Integer pid) {
		// TODO Auto-generated method stub
		return dao.findById(pid);
	}
	@Override
	public List<Post> searchByAuthor(String author) {
		// TODO Auto-generated method stub
		List <Post> p=dao.findAll();
		List <Post> r= new ArrayList();
		for(Post i:p) {
			if (i.getAuthor().equals(author)) {
				r.add(i);
			}
			}
		return r;
	}
	@Override
	public String deletePost(Post post) {
		// TODO Auto-generated method stub
		dao.delete(post);
		return "Post Deleted";
	}
	@Override
	public Post insertPost(Post post) {
		// TODO Auto-generated method stub
		return dao.save(post);
	}
	@Override
	public List<CommentDto> searchCommentByPid(int pid) {
		// TODO Auto-generated method stub
		
		//return proxy.findByPId(pid);
		return template.getForObject("http://COMMENT-SERVICE/getBy/Pid/"+pid, List.class);
	}
	

}
