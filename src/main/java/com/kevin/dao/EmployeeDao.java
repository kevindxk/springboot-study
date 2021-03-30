package com.kevin.dao;

import com.kevin.pojo.Department;
import com.kevin.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @project_name：springbootproject
 * @name：EmployeeDao
 * @date：2021/3/30 9:09 下午
 * @auther：dexukong
 */
@Repository
public class EmployeeDao {

    private static Map<Integer, Employee> employees = null;

    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(101, new Employee(1001, "AA", "123@qq.com", 0, new Department(101,"技术中心"),new Date()));
        employees.put(102, new Employee(1002, "BB", "1234@qq.com", 1, new Department(102,"研发中心"),new Date()));
        employees.put(103, new Employee(1003, "CC", "1238@qq.com", 1, new Department(103,"市场部"),new Date()));
        employees.put(104, new Employee(1004, "DD", "1236@qq.com", 1, new Department(104,"财务部"),new Date()));
        employees.put(105, new Employee(1005, "CC", "1235@qq.com", 0, new Department(105,"人事部"),new Date()));
        employees.put(106, new Employee(1006, "EE", "1236@qq.com", 0, new Department(106,"法务部"),new Date()));
    }

    //增加员工
    private static Integer initId = 1006;

    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }

        employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
        employees.put(employee.getId(), employee);
    }

    public Collection<Employee> getEmployee() {
        return employees.values();
    }

    public Employee getEmployeeById(Integer id) {
        return employees.get(id);
    }

    public void delete(Integer id) {
        employees.remove(id);
    }
}
