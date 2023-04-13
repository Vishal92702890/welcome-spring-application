package com.ensat.services;

import org.springframework.stereotype.Service;
@Service
public class StationWelcomeServiceImpl implements StationWelcomeService {

    @Override
    public String getWelcomeMessage(){
        return "Hello World";
    }
}
