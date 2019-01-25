package com.limetropy.snanalysis.controllers;

import com.limetropy.snanalysis.models.SocialNetworkAnalysis;
import com.limetropy.snanalysis.repositories.SocialNetworkAnalysisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocialNetworkAnalisysController {

	@Autowired
	SocialNetworkAnalysisRepository repository;


	@RequestMapping(method = RequestMethod.GET, value = "/analysis")
	public Iterable<SocialNetworkAnalysis> findAll() {
		return repository.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/analysis/root")
	public Iterable<SocialNetworkAnalysis> findAllLabels() {
		return repository.findAllByLabel("ALL");
	}

	@RequestMapping(method = RequestMethod.GET, value = "/analysis/category/{category}")
	public Iterable<SocialNetworkAnalysis> findByCategory(@PathVariable String category){
		return repository.findAllByCategory(category);
	}
}
