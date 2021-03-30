package com.kevin.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @project_name：springbootproject
 * @name：Penson
 * @description：TODO
 * @date：2021/3/28 11:47 上午
 * @auther：dexukong
 */
@Component
@ConfigurationProperties(prefix = "penson")
public class Penson {

    private String name;
    private Integer age;

    public Penson() {
    }

    public Penson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Penson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
