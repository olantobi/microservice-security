package com.africaprudential.microservicesecurity.controller;

import com.africaprudential.microservicesecurity.model.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api/v1/test")
@RestController
public class TestController {

    @GetMapping
    public ResponseEntity<?> getTestValues() {

        Test test = new Test(1, "Test 1");
        Test test2 = new Test(2, "Test 2");

        List<Test> testList = new ArrayList<>();
        testList.add(test);
        testList.add(test2);

        return ResponseEntity.ok(testList);
    }
}
