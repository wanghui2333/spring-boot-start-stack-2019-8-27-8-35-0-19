package cn.com.zybank.repository;

import cn.com.zybank.model.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述 : Employee数据库
 *
 * @Author : 王辉
 * @Email : wanghui16@zybank.com.cn
 * @Date : 2019-08-27 20:22
 */
public class EmployeeRepository {


    private static List<Employee> employeeDB = new ArrayList<>();

    static {

        employeeDB.add(new Employee(0, "Xiaoming", 20, "Male"));
        employeeDB.add(new Employee(1, "Xiaohong", 19, "Female"));
        employeeDB.add(new Employee(2, "Xiaozhi", 18, "Male"));
        employeeDB.add(new Employee(3, "Xiaogang", 17, "Male"));
        employeeDB.add(new Employee(4, "Xiaoxia", 16, "Female"));

    }

    public static List<Employee> findAllEmployees(){
        return employeeDB;
    }

    /**
     * 功能描述 : 添加一个employee信息
     * @Param : [employee]
     * @Return : boolean 是否添加成功
     * @Author : 王辉
     * @Email : wanghui16@zybank.com.cn
     * @Date : 2019-08-28 10:48
     */
    public static boolean addEmployee(Employee employee){
        employeeDB.add(employee);
        return true;
    }

    /**
     * 功能描述 : 通过id删除一个employee信息
     * @Param : [id]
     * @Return : boolean  是否删除成功
     * @Author : 王辉
     * @Email : wanghui16@zybank.com.cn
     * @Date : 2019-08-28 10:48
     */
    public static boolean deleteEmployeeById(int id){
        for (int i = 0; i < employeeDB.size(); i++) {
            if (employeeDB.get(i).getId() == id){
                employeeDB.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * 功能描述 : 通过id获取一个employee信息
     * @Param : [id]
     * @Return : boolean
     * @Author : 王辉
     * @Email : wanghui16@zybank.com.cn
     * @Date : 2019-08-28 11:47
     */
    public static Employee findEmployeeById(int id){
        for (int i = 0; i < employeeDB.size(); i++) {
            if (employeeDB.get(i).getId() == id){
                return employeeDB.get(i);
            }
        }
        return null;
    }

    /**
     * 功能描述 : 通过name获取一个employee信息
     * @Param : [name]
     * @Return : cn.com.zybank.model.Employee
     * @Author : 王辉
     * @Email : wanghui16@zybank.com.cn
     * @Date : 2019-08-28 14:49
     */
    public static List<Employee> findEmployeeByName(String name) {
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < employeeDB.size(); i++) {
            if (employeeDB.get(i).getName().equals(name)){
                employees.add(employeeDB.get(i));
                return employees;
            }
        }
        return null;
    }

    public static List<Employee> findEmployees(String name) {
        if(name == null){
            return findAllEmployees();
        }
        return findEmployeeByName(name);
    }
}
