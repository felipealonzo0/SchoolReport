package com.reports.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reports")
public class ReportsController {
    
    @PostMapping
    public String saveReport() {
        String foo = "200";
        return foo;
    }

    @GetMapping
    public List<String> getReports() {
        List<String> foo = new ArrayList<>();
        return foo;
    }

    @GetMapping("/student")
    public String getStudentReport(@RequestParam long id) {
        String foo = "student";
        return foo;
    }
}
