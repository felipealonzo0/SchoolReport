package com.reports.repository;

import org.springframework.data.repository.CrudRepository;

import com.reports.base.models.report;

public interface ReportsRepository extends CrudRepository<report, Long>{
    
}
