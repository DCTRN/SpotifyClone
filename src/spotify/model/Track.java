/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Michal
 */
public interface Track {
    public void setTrackName(String NAME);
    public String getTrackName();
    public StringProperty getTrackNameProperty();
    
    public void setTrackMusicType(String TYPE);
    public String getTrackMusicType();
    public StringProperty gertTrackMusicTypeProperty();
    
    public void setArtist(String ARTIST);
    public String getArtist();
    public StringProperty getArtistStringProperty();
    
    public void setTrackAlbum(String ALBUM);
    public String getTrackAlbum();
    public StringProperty getTrackAlbumStringProperty();
    
    public void setTrackLength(int LENGTH);
    public int getTrackLength();
    public IntegerProperty getTrackLengthIntegerProperty();
}
