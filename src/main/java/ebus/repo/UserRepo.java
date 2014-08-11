package ebus.repo;

import ebus.model.User;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.neo4j.repository.RelationshipOperationsRepository;

/**
 * Created by tao.tang on 14-7-31.
 */
public interface UserRepo extends GraphRepository<User>, RelationshipOperationsRepository<User> {
}
