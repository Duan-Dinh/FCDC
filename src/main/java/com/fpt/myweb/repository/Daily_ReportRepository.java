package com.fpt.myweb.repository;

import com.fpt.myweb.entity.Daily_Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Daily_ReportRepository extends JpaRepository<Daily_Report,Long> {

    Daily_Report findAllById(Long id);

    List<Daily_Report> findByUserId(Long id);
    List<Daily_Report> findByDateTime(String time);
}
