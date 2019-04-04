/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Michal
 */
public class TrackImpl implements Track{
    
    private StringProperty name;
    private StringProperty album;
    private StringProperty artist;
    private IntegerProperty length;
    private StringProperty type;

    public TrackImpl(StringProperty name, StringProperty album, StringProperty artist, IntegerProperty length) {
        this.name = new SimpleStringProperty();
        this.album = new SimpleStringProperty();
        this.artist = new SimpleStringProperty();
        this.length = new SimpleIntegerProperty();
        this.type = new SimpleStringProperty();
    }

    @Override
    public void setTrackName(String NAME) {
        name.set(NAME);
    }

    @Override
    public String getTrackName() {
        return name.get();
    }

    @Override
    public StringProperty getTrackNameProperty() {
        return name;
    }

    @Override
    public void setArtist(String ARTIST) {
        artist.set(ARTIST);
    }

    @Override
    public String getArtist() {
        return artist.get();
    }

    @Override
    public StringProperty getArtistStringProperty() {
        return artist;
    }

    @Override
    public void setTrackAlbum(String ALBUM) {
        album.set(ALBUM);
    }

    @Override
    public String getTrackAlbum() {
        return album.get();
    }

    @Override
    public StringProperty getTrackAlbumStringProperty() {
        return album;
    }

    @Override
    public void setTrackLength(int LENGTH) {
        length.set(LENGTH);
    }

    @Override
    public int getTrackLength() {
        return length.get();
    }

    @Override
    public IntegerProperty getTrackLengthIntegerProperty() {
        return length;
    }

    @Override
    public void setTrackMusicType(String TYPE) {
        type.set(TYPE);
    }

    @Override
    public String getTrackMusicType() {
        return type.get();
    }

    @Override
    public StringProperty gertTrackMusicTypeProperty() {
        return type;
    }
    
    

    
}
