package com.ERP.Sales.Commission.Employee;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    public List<Employee> getAllEmployees(){
        return List.of(
                new Employee(UUID.randomUUID(), "kapil","kapu@live.com", "123456","Salesman","Sales",21),
                new Employee(UUID.randomUUID(), "memon","memon@live.com","asdasd","Salesman", "Sales",21)
        );
    }
}
