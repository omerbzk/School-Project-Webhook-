package com.allstudent.data.model;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    private String name; // student Name
    private int age;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "school_id")
    private SchoolData schoolData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SchoolData getSchoolData() {
        return schoolData;
    }

    public void setSchoolData(SchoolData schoolData) {
        this.schoolData = schoolData;
    }
}
