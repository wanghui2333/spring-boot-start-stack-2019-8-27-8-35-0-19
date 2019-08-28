package cn.com.zybank.model;

import java.io.Serializable;

/**
 * 功能描述 : Employee对象
 *
 * @Author : 王辉
 * @Email : wanghui16@zybank.com.cn
 * @Date : 2019-08-27 20:15
 */
public class Employee implements Serializable {

    private int id;
    private String name;
    private int age;
    private String gender;

    public Employee(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
