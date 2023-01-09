package com.example.demo.Controller;

import com.example.demo.Service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoService democontroller;

    @GetMapping(value = "/")
    public String getDemo(){
        return democontroller.hello();
    }
}
