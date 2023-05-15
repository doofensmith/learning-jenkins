package com.learning.jenkinsdemo.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PersonRequest implements Serializable {

    private static final long serialVersionUID = 2482434090592461985L;

    private String name;
    private String email;

}
