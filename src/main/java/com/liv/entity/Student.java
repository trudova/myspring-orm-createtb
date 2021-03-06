package com.liv.entity;

import com.liv.enums.Gender;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    @Column(name = "studentFistName") to change name of column
    private String firstName;
    private String lastName;
    private String email;

    @Transient
    private String city;

    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Temporal(TemporalType.TIME)
    private Date birthTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDateTime;

    @Column(columnDefinition = "DATE")
    private LocalDate localDate;
    @Column(columnDefinition = "TIME")
    private LocalTime localTime;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime localDateTime;
@Enumerated(EnumType.STRING)
    private Gender gender;
}
