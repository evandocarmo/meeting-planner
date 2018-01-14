package com.evandocarmo.meetingplanner.controller;

import com.evandocarmo.meetingplanner.model.Outline;
import com.evandocarmo.meetingplanner.repository.OutlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import javax.validation.Valid;
import java.util.List;

@RestController

public class OutlineController {

    @Autowired
    OutlineRepository outlineRepository;
    
    @GetMapping("/outlines")
    public String outlineList(Model model){
    		return "outlinelist";
    }

    // Get All Outlines
    @GetMapping("/api/outlines")
    public List<Outline> getAllOutlines() {
        return outlineRepository.findAll();
    }

    // Create a new outlines
    @PostMapping("/api/outlines")
    public Outline createOutline(@Valid @RequestBody Outline outline) {
        return outlineRepository.save(outline);
    }

    // Get a Single Outline
    @GetMapping("/api/outlines/{id}")
    public ResponseEntity<Outline> getOutlineById(@PathVariable(value = "id") Long outlineId) {
        Outline outline = outlineRepository.findOne(outlineId);
        if(outline == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(outline);
    }

    // Update

    // Delete
}
