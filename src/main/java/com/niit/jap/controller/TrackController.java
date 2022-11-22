/*
 *Author Name: Sneha Shinde
 *Date: 11/22/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jap.controller;

import com.niit.jap.domain.Track;
import com.niit.jap.service.TrackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TrackController {
    private TrackServiceImpl trackService;

    @Autowired
    public TrackController(TrackServiceImpl trackService) {
        this.trackService = trackService;
    }

    @PostMapping("/insertValue")
    public ResponseEntity<?> save(@RequestBody Track track) {
        return new ResponseEntity<>(trackService.saveTrack(track), HttpStatus.ACCEPTED);
    }

    @GetMapping("/fetchValue/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        return new ResponseEntity<>(trackService.getById(id), HttpStatus.OK);
    }

    @GetMapping("/fetchValue")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(trackService.getAllTracks(), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteValue/{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id) {
        return new ResponseEntity<>(trackService.deleteTrack(id), HttpStatus.OK);
    }

    @GetMapping("/fetchValue/artist={trackArtist}")
    public ResponseEntity<?> getByTrackArtist(@PathVariable String trackArtist) {
        return new ResponseEntity<>(trackService.getByTrackArtist(trackArtist), HttpStatus.ACCEPTED);
    }

    @PutMapping("/updateValue/{id}")
    public ResponseEntity<?> updateTrack(@PathVariable int id, @RequestBody Track track) {
        return new ResponseEntity<>(trackService.updateTrack(id, track), HttpStatus.CREATED);
    }
}


