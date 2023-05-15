package com.learning.jenkinsdemo.repository;

import com.learning.jenkinsdemo.domain.dao.PersonPendingDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonPendingRepository extends JpaRepository<PersonPendingDao, Long> {
}
