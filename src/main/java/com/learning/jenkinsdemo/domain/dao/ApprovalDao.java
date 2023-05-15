package com.learning.jenkinsdemo.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Entity
@Table(name = "t_approval")
public class ApprovalDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
