package com.logistics;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @Column(name = "course_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    @Column(name = "course_name")
    private String courseName;
    private int credits;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Drivers department;

    @OneToMany(mappedBy = "course")
    private List<ClassSchedule> classSchedules;

    // Getters and Setters
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Drivers getDepartment() {
        return department;
    }

    public void setDepartment(Drivers department) {
        this.department = department;
    }

    public List<ClassSchedule> getClassSchedules() {
        return classSchedules;
    }

    public void setClassSchedules(List<ClassSchedule> classSchedules) {
        this.classSchedules = classSchedules;
    }
}
