package com.logistics;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "operators")
public class Operators {
    @Id
    @Column(name = "operator_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int operatorId;

    @ManyToOne
    @JoinColumn(name = "first_name")
    private Base firstName;

    @ManyToOne
    @JoinColumn(name = "middle_name")
    private Teacher middleName;

    @ManyToOne
    @JoinColumn(name = "experience")
    private Delivery experience;

    private String semester;
    private int year;

    @Column(name = "base_id")
    private LocalTime baseId;

    // Getters and Setters
    public int getOperator_id() {
        return operatorId;
    }

    public void setFirstName(int firstName) {
        this.firstName = firstName;
    }

    public Base middleName() {
        return middleName;
    }

    public void setExperience(Base experience) {
        this.experience = experience;
    }
}
