package it.develhope.MIddleWare01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
@RequestMapping("time")
public class BasicController {

    @GetMapping
    public LocalDateTime getTime(){
        return LocalDateTime.now();
    }
}
