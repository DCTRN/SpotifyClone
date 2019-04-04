/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify.model;

import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Michal
 */
public class ArtistImpl implements Artist {
    
    private StringProperty name;
    private StringProperty track;
    private List<String> trackList;
    private StringProperty album;
    private List<String> albumList;
    private StringProperty type;

    public ArtistImpl() {
        this.name = new SimpleStringProperty();
        this.track = new SimpleStringProperty();
        this.trackList = new ArrayList<>();
        this.album = new SimpleStringProperty();
        this.albumList = new ArrayList<>();
        this.type = new SimpleStringProperty();
    }
    
    
    
    @Override
    public void setArtistName(String NAME) {
        name.set(NAME);
    }

    @Override
    public String getArtistName() {
        return name.get();
    }

    @Override
    public StringProperty getArtistNameProperty() {
        return name;
    }

    @Override
    public void setArtistTrack(String TRACK) {
        track.set(TRACK);
    }

    @Override
    public String getArtistTrack() {
        return track.get();
    }

    @Override
    public List<String> getArtistTrackList() {
        return trackList;
    }

    @Override
    public StringProperty getArtistTrackStringProperty() {
        return track;
    }

    @Override
    public void setArtistAlbum(String ALBUM) {
        album.set(ALBUM);
    }

    @Override
    public String getArtistAlbum() {
        return album.get();
    }

    @Override
    public List<String> getArtistAlbumList() {
        return albumList;
    }

    @Override
    public StringProperty getArtistAlbumStringProperty() {
        return album;
    }

    @Override
    public void setArtistMusicType(String TYPE) {
        type.set(TYPE);
    }

    @Override
    public String getArtistMusicType() {
        return type.get();
    }

    @Override
    public StringProperty getArtistMusicTypeProperty() {
        return type;
    }
    
}
