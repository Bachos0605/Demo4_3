package com.example.demo.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {
    public String hello(){
        return "Hello World!";
    }

}
