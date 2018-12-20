package com.mygglo.labs.projection.custom.controller;

import com.mygglo.labs.projection.custom.domain.EmployeeJobHistory;
import com.mygglo.labs.projection.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author James Kokou GAGLO
 * @date 20/12/2018
 */
@RestController
@RequestMapping("/api")
public class TestController {

    private final EmployeeService employeeService;

    public TestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee-history")
    public ResponseEntity getAll() {

        List<EmployeeJobHistory> result = employeeService.findAllWithProjection();

        return ResponseEntity.ok()
            .body(result);
    }
}
