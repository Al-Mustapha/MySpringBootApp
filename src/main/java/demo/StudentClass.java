package demo;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;



@Entity
public class StudentClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String department;

    public StudentClass(Long id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public StudentClass() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}





