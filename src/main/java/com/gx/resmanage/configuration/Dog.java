package com.gx.resmanage.configuration;

/**
 * @author gaoxu
 * @date 2019-09-04 15:41
 */
public class Dog {


    private String name;
    private Integer age;


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}
