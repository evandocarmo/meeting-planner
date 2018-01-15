package com.evandocarmo.meetingplanner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

@RequestMapping("/")

public class MainController {
	@RequestMapping(method = RequestMethod.GET)
    public String index(){
    		return "index";
    }
}