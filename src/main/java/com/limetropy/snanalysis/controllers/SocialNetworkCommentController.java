package com.limetropy.snanalysis.controllers;

import com.limetropy.snanalysis.models.SocialNetworkComment;
import com.limetropy.snanalysis.repositories.SocialNetworkCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocialNetworkCommentController {

	@Autowired
	SocialNetworkCommentRepository repository;

	@RequestMapping(method = RequestMethod.GET, value = "/comments")
	public Iterable<SocialNetworkComment> findAll() {
		return repository.findAll();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/comments")
	public String save(@RequestBody SocialNetworkComment socialNetworkComment){
		repository.save(socialNetworkComment);
		return socialNetworkComment.getId();
	}
}
