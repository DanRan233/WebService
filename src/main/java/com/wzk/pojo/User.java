package com.wzk.pojo;

import javax.xml.bind.annotation.*;

/**
 * @program: RestFul_demo
 * @author: DANRAN2333
 * @create: 2019-12-11 13:08
 * @description:
 */
@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
public class User {


    @XmlElement(required = true)
    int id;

    @XmlElement(required = true)
    String name;


    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
