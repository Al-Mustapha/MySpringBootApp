package demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class MyRepositoryClass implements JpaRepository<StudentClass, Long> {

}
