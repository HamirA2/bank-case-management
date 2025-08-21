package com.bank.case_management.repositories;

import com.bank.case_management.entities.Case;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Case, Integer> {

}
