/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import spotify.util.DBUtil;
/**
 *
 * @author Michal
 */
public class ArtistDAO {
    
    
    //dokonczyc uzupelnianie danych artysty
    
    
 public static ObservableList<ArtistImpl> getArtistByName(String NAME) throws SQLException, ClassNotFoundException {
        String sql = "SELECT artist.ART_Name FROM artist WHERE ART_Name = '" + NAME + "'";
        try {
            ResultSet rs = DBUtil.dbExecute(sql);
            ObservableList<ArtistImpl> artistsList = getArtistObjects(rs);
            return artistsList;
        } catch (SQLException e) {
            System.out.println("Error while searching artist by name" + e);
            e.printStackTrace();
            throw e;
        }
    }
    
    
public static ObservableList<ArtistImpl> getArtistByMusicCategory(String CATEGORY) throws SQLException, ClassNotFoundException {
        String sql = "SELECT artist.ART_Name "
                + "FROM artist, music_categories "
                + "WHERE (artist.MUS_id = music_categories.MUS_id) "
                + "AND music_categories.MUS_Category= '" + CATEGORY + "'; ";
        try {
            ResultSet rs = DBUtil.dbExecute(sql);
            ObservableList<ArtistImpl> artistsList = getArtistObjects(rs);
            return artistsList;
        } catch (SQLException e) {
            System.out.println("Error while searching artist by category" + e);
            e.printStackTrace();
            throw e;
        }
    }
    
public static ObservableList<ArtistImpl> getAllArtists() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM Artist";
        try {
            ResultSet rs = DBUtil.dbExecute(sql);
            ObservableList<ArtistImpl> artistsList = getArtistObjects(rs);
            return artistsList;
        } catch (SQLException e) {
            System.out.println("Error while making artist list query" + e);
            e.printStackTrace();
            throw e;
        }
    }

    private static ObservableList<ArtistImpl> getArtistObjects(ResultSet rs)  throws SQLException, ClassNotFoundException {
        try {
            ObservableList<ArtistImpl> categoriesList = FXCollections.observableArrayList();
            while(rs.next()) {
                ArtistImpl artist = new ArtistImpl();
                artist.setArtistName(rs.getString("ART_Name"));
                categoriesList.add(artist);
            }
            return categoriesList;
        } catch (SQLException e) {
            System.out.println("Error while making categories list" + e);
            e.printStackTrace();
            throw e;
        }
    }
    
}
