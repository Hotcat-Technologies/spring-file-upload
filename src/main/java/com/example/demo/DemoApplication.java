package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {

//        Employee employee = new Employee();
//        employee.setFirstName("Kamal");
//        employee.setLastName("Herath");
//        employee.setEmail("kamal@gmail.com");
//        employeeRepository.save(employee);
//
//        Employee employee1 = new Employee();
//        employee1.setFirstName("Nimal");
//        employee1.setLastName("Perera");
//        employee1.setEmail("nimal@gmail.com");
//        employeeRepository.save(employee1);
    }
}
