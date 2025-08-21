package com.bank.case_management.mapper;

import com.bank.case_management.dto.CaseDto;
import com.bank.case_management.entities.Case;

public class CaseMapper {

    public static CaseDto mapToCaseDto(Case cases) {
        return new CaseDto(
                cases.getId(),
                cases.getCaseName(),
                cases.getCaseDescription(),
                cases.getCasePriority(),
                cases.getCaseStatus()
        );
    }

}
