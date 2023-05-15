package com.learning.jenkinsdemo.service;

import com.learning.jenkinsdemo.domain.request.PersonRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {

    ResponseEntity<Object> newData(PersonRequest request);

}
