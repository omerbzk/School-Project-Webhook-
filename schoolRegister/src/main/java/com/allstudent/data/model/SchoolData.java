package com.allstudent.data.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class SchoolData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    private String schoolName;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "schoolData", cascade = CascadeType.ALL)
    private List<WebhookDetails> webhookDetails;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "schoolData", cascade = CascadeType.ALL)
    private List<Student> students;

    public List<WebhookDetails> getWebhookDetails() {
        return webhookDetails;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setWebhookDetails(List<WebhookDetails> webhookDetails) {
        this.webhookDetails = webhookDetails;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
