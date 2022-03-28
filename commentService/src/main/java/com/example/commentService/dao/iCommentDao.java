package com.example.commentService.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.commentService.model.Comment;

@Transactional
@Repository
public interface iCommentDao extends JpaRepository<Comment, Integer>{
	


}
