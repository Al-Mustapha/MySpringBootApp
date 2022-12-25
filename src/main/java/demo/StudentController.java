package demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private ServiceClass serviceClass;

    @PostMapping("/save")
    public StudentClass SaveStudent(@RequestBody StudentClass studentClass){
        return serviceClass.saveStudent(studentClass);

    }
    @GetMapping("/getStudent")
    public StudentClass getStudents(@PathVariable("id") Long id){
        return serviceClass.getStudents(id);
    }






}
