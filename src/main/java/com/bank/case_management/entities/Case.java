package com.bank.case_management.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cases")
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "case_name")
    private String caseName;
    @Column(name = "case_description")
    private String caseDescription;
    @Column(name = "case_priority")
    private String casePriority;
    @Column(name = "case_status")
    private String caseStatus;
    @CreationTimestamp
    @Column(name = "date_added")
    private LocalDate dateAdded;

}
