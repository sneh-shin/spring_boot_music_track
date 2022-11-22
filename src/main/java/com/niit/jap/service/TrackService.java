package com.niit.jap.service;

import com.niit.jap.domain.Track;

import java.util.List;

public interface TrackService {
    Track saveTrack(Track track);

    List<Track> getAllTracks();

    Track getById(int id);

    String deleteTrack(int id);

    List<Track> getByTrackArtist(String trackArtist);

    Track updateTrack(int id);

}
