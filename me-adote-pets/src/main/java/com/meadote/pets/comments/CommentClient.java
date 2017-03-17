package com.meadote.pets.comments;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("comments")
public interface CommentClient {
	
	@RequestMapping(value = "/comments/search/findByPetId?petId={id}", method = RequestMethod.GET)
	Resources<Comment> findAll(@PathVariable("id") long id);
	
}