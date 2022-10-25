package com.jahan.springrestazure;

import com.jahan.springrestazure.domain.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class SpringRestAzureApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestAzureApplication.class, args);
    }



    @GetMapping("/employee")

    public Employee sayHello() {
        Employee employee = new Employee("Samiul", "Jahan", "sj@gmail.com");
        return employee;
    }

}
