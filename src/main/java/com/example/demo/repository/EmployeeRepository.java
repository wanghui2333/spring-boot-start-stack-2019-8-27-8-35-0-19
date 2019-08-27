package com.example.demo.repository;

import com.example.demo.mode.Employee;

import java.util.ArrayList;

/**
 * 功能描述 : TODO
 *
 * @Author : 王辉
 * @Email : wanghui16@zybank.com.cn
 * @Date : 2019-08-27 20:22
 */
public class EmployeeRepository {
    private static ArrayList<Employee> employeeDB = new ArrayList<>();

    static {

        employeeDB.add(new Employee(0, "Xiaoming", 20, "Male"));
        employeeDB.add(new Employee(1, "Xiaohong", 19, "Female"));
        employeeDB.add(new Employee(2, "Xiaozhi", 18, "Male"));
        employeeDB.add(new Employee(3, "Xiaogang", 17, "Male"));
        employeeDB.add(new Employee(4, "Xiaoxia", 16, "Female"));

    }

    public static ArrayList<Employee> getAllEmployees(){
        return employeeDB;
    }

    public static boolean addEmployee(Employee employee){
        employeeDB.add(employee);
        return true;
    }

    public static boolean deleteEmployee(int id){
        for (int i = 0; i < employeeDB.size(); i++) {
            if (employeeDB.get(i).getId() == id){
                employeeDB.remove(i);
                return true;
            }
        }
        return false;
    }
}
