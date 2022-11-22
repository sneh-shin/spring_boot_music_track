/*
 *Author Name: Sneha Shinde
 *Date: 11/22/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jap.service;

import com.niit.jap.domain.Track;
import com.niit.jap.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackServiceImpl implements TrackService {

    private TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track) {
        return trackRepository.save(track);
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }

    @Override
    public Optional<Track> getById(int id) {
        return trackRepository.findById(id);
    }

    @Override
    public String deleteTrack(int id) {
        trackRepository.deleteById(id);
        return "Track successfully deleted.";
    }

    @Override
    public List<Track> getByTrackArtist(String trackArtist) {
        return trackRepository.getByTrackArtist(trackArtist);
    }

    @Override
    public Track updateTrack(int id) {
        return null;
    }
}
