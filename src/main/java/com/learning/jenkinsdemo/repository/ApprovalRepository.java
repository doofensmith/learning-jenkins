package com.learning.jenkinsdemo.repository;


import com.learning.jenkinsdemo.domain.dao.ApprovalDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprovalRepository extends JpaRepository<ApprovalDao, Long> {
}
