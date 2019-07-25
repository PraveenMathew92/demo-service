package com.vibe.demoservice.controller;

import com.vibe.demoservice.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class DemoController {

    @Autowired
    private DemoService service;

    @GetMapping
    public @ResponseBody Map<String, Object> get() {
        return service.get();
    }
}
