package com.niit.jap.repository;

import com.niit.jap.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track, Integer> {
    public List<Track> getByTrackArtist(String trackArtist);
}
