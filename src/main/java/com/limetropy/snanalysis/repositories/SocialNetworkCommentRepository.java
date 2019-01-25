package com.limetropy.snanalysis.repositories;

import com.limetropy.snanalysis.models.SocialNetworkComment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SocialNetworkCommentRepository extends MongoRepository<SocialNetworkComment, String>{

	List<SocialNetworkComment> findByService(String service);

	List<SocialNetworkComment> findByBrand(String brand);
}
