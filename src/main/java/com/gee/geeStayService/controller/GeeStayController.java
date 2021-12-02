package com.gee.geeStayService.controller;

import com.gee.geeStayService.entity.Employee;
import com.gee.geeStayService.service.GeeStayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/geeStay")
public class GeeStayController {

    @Autowired
    private GeeStayService geeStayService;

    @PostMapping("/initiate")
    public ResponseEntity initiate(@RequestBody Employee employee){
        geeStayService.initiate(employee);
    }
}
