package com.vibe.demoservice.controller;

import com.vibe.demoservice.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class DemoController {

    @Autowired
    private DemoService service;

    @GetMapping("/{seconds}")
    public @ResponseBody Map<String, Object> get(@PathVariable("seconds") int seconds) {
        return service.get(seconds);
    }
}
