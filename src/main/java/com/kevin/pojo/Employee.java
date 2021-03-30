package com.kevin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * @project_name：springbootproject
 * @name：Employee
 * @date：2021/3/30 8:48 下午
 * @auther：dexukong
 */
//员工表
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Department department;
    private Date birth;

}
