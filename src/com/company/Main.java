package com.company;

import com.utkarsh.employee.Employee;
import com.utkarsh.util.JsonUtil;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee employee = new Employee();
        employee.setName("utkarsh tyagi");
        employee.setEmpNo(1001);
        employee.setSalary(20000);
        String jsonEmployee = JsonUtil.convertJavaToJson(employee);
        System.out.println(jsonEmployee);
    }
}
