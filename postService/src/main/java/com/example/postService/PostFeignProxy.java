package com.example.postService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.cloud.openfeign.FeignClient;
import com.example.postService.model.CommentDto;

@FeignClient(name="comment-service", url="http://localhost:8083/")
public interface PostFeignProxy {
	
	@GetMapping("/getBy/Pid/{pid}")
	public List<CommentDto> findByPId(@PathVariable("pid") Integer pid);
		
	

}
