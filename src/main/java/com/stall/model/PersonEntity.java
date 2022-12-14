//Model class code for rest api using jsp,jdbc,jpa
package com.stall.model;
import javax.persistence.*;

@Entity
@Table(name = "person")
public class PersonEntity  {
    @Id
    @Column(name= "id")
    private long id;
    @Column(name = "age")
    private int age;
    @Column(name = "name")
    private String name;
    @Column(name= "mobile")
    private long mobile;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
}
