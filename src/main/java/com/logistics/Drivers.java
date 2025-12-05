package com.logistics;

import javax.persistence.*;

@Entity
@Table(name = "drivers")
public class Drivers {
    @Id
    @Column(name = "driver_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "transport_type")
    private String transportType;

    // Getters and Setters
    public int getDriverId() {
        return drivertId;
    }

    public void setLastName(int lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getTransportType(String transportType) {
        return transportType;
    }
}
