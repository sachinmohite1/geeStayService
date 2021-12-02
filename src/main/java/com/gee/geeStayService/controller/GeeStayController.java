package com.gee.geeStayService.controller;

import com.gee.geeStayService.entity.Employee;
import com.gee.geeStayService.service.GeeStayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;


@RestController("/geestay")
public class GeeStayController {

    @Autowired
    private GeeStayService geeStayService;

    @PostMapping("/initiate")
    public ResponseEntity initiate(@RequestBody Employee employee){
        geeStayService.initiate(employee);
        return  new ResponseEntity<>( HttpStatus.OK);

    }
    
    @GetMapping("/listall")
    public ResponseEntity listAllEmployee(){

        List<Employee> employees = geeStayService.listAllEmployess();
        if (employees.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
