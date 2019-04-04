/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Michal
 */
public class MusicCategoryImpl implements MusicCategory {

    private StringProperty Name;

    public MusicCategoryImpl() {
        this.Name = new SimpleStringProperty();
    }
    
    
    @Override
    public void setMusicCategoryName(String NAME) {
        Name.set(NAME);
    }

    @Override
    public String getMusicCategoryName() {
       return Name.get();
    }

    @Override
    public StringProperty getMusicCategoryNameProperty() {
        return Name;
    }
    
}
