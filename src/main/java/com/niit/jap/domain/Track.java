/*
 *Author Name: Sneha Shinde
 *Date: 11/22/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jap.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Track {
    @Id
    int trackId;
    String trackName;
    String trackComments;
    double trackRating;
    String trackArtist;

    public Track() {
    }

    public Track(int trackId, String trackName, String trackComments, double trackRating, String trackArtist) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackComments = trackComments;
        this.trackRating = trackRating;
        this.trackArtist = trackArtist;
    }
}
