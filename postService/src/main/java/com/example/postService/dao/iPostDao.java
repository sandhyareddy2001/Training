package com.example.postService.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postService.model.CommentDto;
import com.example.postService.model.Post;


@Transactional
@Repository
public interface iPostDao extends JpaRepository<Post,Integer>{
	public List<CommentDto> searchCommentByPid(int pid);
	

}
