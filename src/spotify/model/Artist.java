/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify.model;

import java.util.List;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Michal
 */
public interface Artist {
    
    public void setArtistName(String NAME);
    public String getArtistName();
    public StringProperty getArtistNameProperty();
    
    public void setArtistMusicType(String TYPE);
    public String getArtistMusicType();
    public StringProperty getArtistMusicTypeProperty();
    
    public void setArtistTrack(String TRACK);
    public String getArtistTrack();
    public List<String> getArtistTrackList();
    public StringProperty getArtistTrackStringProperty();
    
    public void setArtistAlbum(String ALBUM);
    public String getArtistAlbum();
    public List<String> getArtistAlbumList();
    public StringProperty getArtistAlbumStringProperty();
    
    
    
    
}
