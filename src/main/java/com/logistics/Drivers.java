package com.logistics;

import javax.persistence.*;

@Entity
@Table(name = "drivers")
public class Drivers {
    @Id
    @Column(name = "department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentId;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    // Getters and Setters
    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
