package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplement implements ServiceClass {

    @Autowired
    private MyRepositoryClass repositoryClass;

    @Override
    public StudentClass saveStudent(StudentClass studentClass) {
        return repositoryClass.save(studentClass);

    }

    @Override
    public StudentClass getStudents(Long id) {
        return repositoryClass.findById(id).get();
    }


}
