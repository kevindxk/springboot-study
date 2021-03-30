package com.kevin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @project_name：springbootproject
 * @name：Department
 * @date：2021/3/30 8:51 下午
 * @auther：dexukong
 */
//部门表

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private Integer id;
    private String departmentName;

}
