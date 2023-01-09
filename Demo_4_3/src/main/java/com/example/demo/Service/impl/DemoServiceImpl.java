package com.example.demo.Service.impl;

import com.example.demo.Repository.DemoRepository;
import com.example.demo.Service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoRepository demoserviceimpl;

    @Override
    public String hello(){
        return demoserviceimpl.hello();
    }
}
