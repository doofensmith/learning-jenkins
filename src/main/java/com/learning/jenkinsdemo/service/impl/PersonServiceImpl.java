package com.learning.jenkinsdemo.service.impl;

import com.learning.jenkinsdemo.domain.request.PersonRequest;
import com.learning.jenkinsdemo.repository.PersonPendingRepository;
import com.learning.jenkinsdemo.repository.PersonRepository;
import com.learning.jenkinsdemo.service.PersonService;
import com.learning.jenkinsdemo.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonPendingRepository personPendingRepository;

    @Transactional
    @Override
    public ResponseEntity<Object> newData(PersonRequest request) {
        personRepository.spInsertPerson(request.getName(), request.getEmail());

        return ResponseUtil.build(HttpStatus.OK, "Success", null);
    }
}
