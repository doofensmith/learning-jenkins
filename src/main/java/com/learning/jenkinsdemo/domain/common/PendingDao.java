package com.learning.jenkinsdemo.domain.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@MappedSuperclass
public abstract class PendingDao extends BaseDao {

    private static final long serialVersionUID = -4159320970810821248L;

    @Column(name = "ticket_no", nullable = false)
    private Long ticketNo;

    @Column(name = "module_changed", nullable = false)
    private String moduleChanged;

    @Column(name = "module_level", nullable = false)
    private String moduleLevel;

    @Column(name = "is_approved", nullable = false)
    private Boolean isApproved;

    @Column(name = "approved_at")
    private LocalDateTime approvedAt;

    @Column(name = "approved_by")
    private String approvedBy;

    @Override
    void onCreate() {
        super.onCreate();
        this.isApproved = Boolean.FALSE;
    }
}
