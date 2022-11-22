package com.niit.jap.service;

import com.niit.jap.domain.Track;

import java.util.List;
import java.util.Optional;

public interface TrackService {
    Track saveTrack(Track track);

    List<Track> getAllTracks();

    Optional<Track> getById(int id);

    String deleteTrack(int id);

    List<Track> getByTrackArtist(String trackArtist);

    Track updateTrack(int id);

}
