package com.learning.jenkinsdemo.domain.dao;

import com.learning.jenkinsdemo.domain.common.PendingDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Entity
@Table(name = "t_person_pending")
@SQLDelete(sql = "update t_person_pending set approved_at=current_timestamp, is_approved=true where id=?")
public class PersonPendingDao extends PendingDao {

    private static final long serialVersionUID = -1768613348530956626L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

}
