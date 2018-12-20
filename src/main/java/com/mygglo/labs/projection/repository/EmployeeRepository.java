package com.mygglo.labs.projection.repository;

import com.mygglo.labs.projection.custom.domain.EmployeeJobHistory;
import com.mygglo.labs.projection.domain.Employee;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Spring Data  repository for the Employee entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "SELECT e.id , e.first_name AS firstName, e.last_name AS lastName, e.email, " +
        "j.start_date  AS startDate, j.end_date  AS endDate " +
        "FROM employee e JOIN job_history j " +
        "ON  e.id = j.employee_id",
        nativeQuery = true)
    List<EmployeeJobHistory> findAllWithProjection();
}
