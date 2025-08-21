package com.bank.case_management.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CaseDto {
    private int id;
    private String caseName;
    private String caseDescription;
    private String casePriority;
    private String caseStatus;

}
