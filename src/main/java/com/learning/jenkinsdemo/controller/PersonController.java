package com.learning.jenkinsdemo.controller;

import com.learning.jenkinsdemo.domain.request.PersonRequest;
import com.learning.jenkinsdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping(value = "/new-data")
    public ResponseEntity<Object> newData(@RequestBody PersonRequest request) {
        try {
            return personService.newData(request);
        }catch (Exception e) {
            throw e;
        }
    }

}
