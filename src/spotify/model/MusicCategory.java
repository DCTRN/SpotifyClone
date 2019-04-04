/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify.model;

import javafx.beans.property.StringProperty;

/**
 *
 * @author Michal
 */
public interface MusicCategory {
    public void setMusicCategoryName(String NAME);
    public String getMusicCategoryName();
    public StringProperty getMusicCategoryNameProperty();
}
