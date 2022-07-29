package it.develhope.MIddleWare01.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {

    public String get(){
        return "This is just old code";
    }
}
