package com.mygglo.labs.projection.custom.domain;

import java.time.Instant;

/**
 * @author James Kokou GAGLO
 * @date 20/12/2018
 */
public interface EmployeeJobHistory {
    Long getId();
    String getFirstName();
    String getLastName();
    String getEmail();
    Instant getStartDate();
    Instant getEndDate();
}
