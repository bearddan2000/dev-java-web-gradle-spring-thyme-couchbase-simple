package example.repository;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import example.model.Dog;

@N1qlPrimaryIndexed
@ViewIndexed(designDoc="dog",viewName="all")
public interface DogRepository extends CouchbaseRepository<Dog, Integer>{

}
