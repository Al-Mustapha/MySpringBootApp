package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private ServiceClass serviceClass;

	@PostMapping("/save")
	public StudentClass SaveStudent(@RequestBody StudentClass studentClass) {
		return serviceClass.saveStudent(studentClass);

	}

	@GetMapping("/getStudent/{id}")
	public StudentClass getStudents(@PathVariable("id") Long id) {
		return serviceClass.getStudents(id);
	}

}
