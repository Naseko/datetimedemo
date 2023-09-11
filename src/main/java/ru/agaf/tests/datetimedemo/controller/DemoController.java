package ru.agaf.tests.datetimedemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.agaf.tests.datetimedemo.service.DemoService;

@Slf4j
@RestController
public class DemoController {

    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService){
        this.demoService = demoService;
    }

    @GetMapping("/start")
    public void startDemo(){
        demoService.start();
    }
}
