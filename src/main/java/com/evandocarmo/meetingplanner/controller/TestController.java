package com.evandocarmo.meetingplanner.controller;

import com.evandocarmo.meetingplanner.model.Outline;
import com.evandocarmo.meetingplanner.repository.OutlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller

public class TestController {
	@GetMapping("/outlines")
    public String outlineList(){
    		return "outlinelist";
    }
}