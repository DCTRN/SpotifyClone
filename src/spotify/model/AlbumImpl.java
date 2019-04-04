/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify.model;

import java.util.List;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Michal
 */
public class AlbumImpl implements Album {
    
    private StringProperty name;
    private StringProperty type;
    private StringProperty artist;
    private List<String> tracks;
    private IntegerProperty length;

    @Override
    public void setAlbumName(String NAME) {
        name.set(NAME);
    }

    @Override
    public String getAlbumName() {
        return name.get();
    }

    @Override
    public StringProperty getAlbumNameProperty() {
        return name;
    }

    @Override
    public void setAlbumMusicType(String TYPE) {
        type.set(TYPE);
    }

    @Override
    public String getAlbumkMusicType() {
        return type.get();
    }

    @Override
    public StringProperty gertAlbumMusicTypeProperty() {
        return type;
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
    public void setAlbumTracks(List<String> TRACKS) {
        tracks = TRACKS;
    }

    @Override
    public List<String> getAlbumTracks() {
        return tracks;
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
    
}
