package com.vibe.demoservice.service;

import com.vibe.demoservice.dal.MyStoredProcedure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DemoService {

    @Autowired
    private MyStoredProcedure myStoredProcedure;

    public Map<String, Object> get() {
        return myStoredProcedure.execute();
    }
}

