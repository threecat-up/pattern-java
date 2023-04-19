package com.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author threecat
* @date 2023/4/19
*/
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary + " ]";
    }
}
