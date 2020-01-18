/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Records  {
	HashMap<String, Employee> map;
    private ArrayList employees; //Stores the employees

    public Records() {
        employees = new ArrayList();
    }

    public Employee insert(Employee employee) {
    	 return map.put(employee.getEmployeeName(), employee);
    }    

    public Employee remove(long emp_num) {
    	return map.remove(emp_num);
    }

    public Employee searchByName(String employeeName) {
        Employee employee = map.get(employeeName);
        System.out.println(employee);
        return employee;
    }
    
}
