package com.jusitn.app.controller;

import com.jusitn.app.model.InputModel;
import com.jusitn.app.model.OutPutModel;
import com.jusitn.app.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @RequestMapping(value = "/events",method = RequestMethod.GET)
    public ResponseEntity<OutPutModel> getevents(@RequestParam(value ="location") String location,
                                                 @RequestParam(value = "keywords") String keywords) throws IOException {
        InputModel model = new InputModel();
        model.setKeyword(keywords);
        model.setLocation(location);
        OutPutModel outPutModel = eventService.getEventsByLocationAndKeyWors(model);

        return new ResponseEntity<OutPutModel>(outPutModel,HttpStatus.OK);
    }
}
