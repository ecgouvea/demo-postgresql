package com.ecgouvea.example.demopostgresql.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class DatabaseConnectController {

    @GetMapping("/teste")
    public String teste() throws Exception {
        String url = "jdbc:postgresql://dev-simuladortributario.ctabjq8ajjko.us-east-1.rds.amazonaws.com:5432/simuladortributario?user=simtribRoot12&password=&ssl=true";
        Connection conn = DriverManager.getConnection(url);

        return "ok";
    }
    
}