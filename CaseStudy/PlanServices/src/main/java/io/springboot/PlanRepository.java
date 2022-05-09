package io.springboot;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface PlanRepository extends MongoRepository<PlansAndDetails,String>{
}
