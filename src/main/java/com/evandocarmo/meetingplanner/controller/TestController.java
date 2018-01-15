package com.evandocarmo.meetingplanner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

@RequestMapping("/outlines")

public class TestController {
	@RequestMapping(method = RequestMethod.GET)
    public String outlineList(){
    		return "outlinelist";
    }
}