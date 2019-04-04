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
public interface Album {
    public void setAlbumName(String NAME);
    public String getAlbumName();
    public StringProperty getAlbumNameProperty();
    
    public void setAlbumMusicType(String TYPE);
    public String getAlbumkMusicType();
    public StringProperty gertAlbumMusicTypeProperty();
    
    public void setArtist(String ARTIST);
    public String getArtist();
    public StringProperty getArtistStringProperty();
    
    public void setAlbumTracks(List<String> TRACKS);
    public List<String> getAlbumTracks();
    
    public void setTrackLength(int LENGTH);
    public int getTrackLength();
    public IntegerProperty getTrackLengthIntegerProperty();
}
