package com.ensat.controllers;

import com.ensat.services.StationWelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StationWelcomeController {
     @Autowired
     private StationWelcomeService stationService;

     @RequestMapping(value = "/getWelcomeMessage", method = RequestMethod.GET)
     public String getWelcomeMessage(){
         return stationService.getWelcomeMessage();
     }
}
