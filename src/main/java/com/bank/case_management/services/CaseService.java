package com.bank.case_management.services;

import com.bank.case_management.dto.CaseDto;

public interface CaseService<T extends CaseDto> {
    T createCase(CaseDto caseDto);

}
