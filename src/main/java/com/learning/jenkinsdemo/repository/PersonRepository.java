package com.learning.jenkinsdemo.repository;

import com.learning.jenkinsdemo.domain.dao.PersonDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends JpaRepository<PersonDao, Long> {

    @Procedure(value = "sp_insert_person")
    void spInsertPerson(String name, String email);

}
