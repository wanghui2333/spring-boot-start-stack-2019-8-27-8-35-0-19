package com.example.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.example.demo.mode.Employee;
import com.example.demo.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * 功能描述 : TODO
 *
 * @Author : 王辉
 * @Email : wanghui16@zybank.com.cn
 * @Date : 2019-08-27 20:17
 */
@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeesController {

    @GetMapping("")
    public ResponseEntity<JSONArray> getEmployees() {

        JSONArray jsonArray = new JSONArray();
        jsonArray.addAll(EmployeeRepository.getAllEmployees());
        return ResponseEntity.ok(jsonArray);
    }

    @PostMapping("")
    public ResponseEntity<String> postEmployees(@RequestBody Employee employee) {
        EmployeeRepository.addEmployee(employee);
        return ResponseEntity.ok("添加成功");
    }

    @DeleteMapping("")
    public ResponseEntity<String> deleteEmployees(@RequestBody Employee employee) {

        if (EmployeeRepository.deleteEmployee(employee.getId())){
            return ResponseEntity.ok("删除成功");
        }

        return ResponseEntity.ok("该员工不存在");
    }

    @PutMapping("")
    public ResponseEntity<String> patchEmployees(@RequestBody Employee employee) {

        if (EmployeeRepository.deleteEmployee(employee.getId())){
            EmployeeRepository.addEmployee(employee);
            return ResponseEntity.ok("修改成功");
        }
        return ResponseEntity.ok("该员工不存在，修改失败");
    }
}
