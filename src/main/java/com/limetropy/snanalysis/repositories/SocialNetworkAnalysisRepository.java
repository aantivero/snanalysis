package com.limetropy.snanalysis.repositories;

import com.limetropy.snanalysis.models.SocialNetworkAnalysis;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "analysis", path = "analysisData")
public interface SocialNetworkAnalysisRepository extends MongoRepository<SocialNetworkAnalysis, String>{

	public List<SocialNetworkAnalysis> findAllByLabel(String label);

	public List<SocialNetworkAnalysis> findAllByCategory(String category);
}
