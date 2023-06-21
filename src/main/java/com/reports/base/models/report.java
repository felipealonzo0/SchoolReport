package com.reports.base.models;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "report")
public class report {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    @Getter
    @Setter
    long studentid;

    @Getter
    @Setter
    String firstname;

    @Getter
    @Setter
    String lastname;

    @Getter
    @Setter
    String birthdate;

    @Getter
    @Setter
    String group;

    @Getter
    @Setter
    String evaluationid;

    @Getter
    @Setter
    String score;   
}