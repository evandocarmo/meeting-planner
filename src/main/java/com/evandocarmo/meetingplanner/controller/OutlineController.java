package com.evandocarmo.meetingplanner.controller;

import com.evandocarmo.meetingplanner.model.Outline;
import com.evandocarmo.meetingplanner.repository.OutlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")

public class OutlineController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    OutlineRepository outlineRepository;

    // Get All Outlines
    @GetMapping("/outlines")
    public List<Outline> getAllOutlines() {
        return outlineRepository.findAll();
    }

    // Create a new outlines
    @PostMapping("/outlines")
    public Outline createOutline(@Valid @RequestBody Outline outline) {
    		log.info(outline.toString());
        return outlineRepository.save(outline);
    }

    // Get a Single Outline
    @GetMapping("/notes/{id}")
    public ResponseEntity<Outline> getOutlineById(@PathVariable(value = "id") Long outlineId) {
        Outline outline = outlineRepository.findOne(outlineId);
        if(outline == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(outline);
    }

    // Update a Note

    // Delete a Note
}
