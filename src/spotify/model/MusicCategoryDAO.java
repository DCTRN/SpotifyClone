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
public class MusicCategoryDAO {
    
    public static ObservableList<MusicCategoryImpl> getAllMusicCategories() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM music_categories";
        try {
            ResultSet rs = DBUtil.dbExecute(sql);
            ObservableList<MusicCategoryImpl> categoriesList = getMusicCategoryObjects(rs);
            return categoriesList;
        } catch (SQLException e) {
            System.out.println("Error while making category list query" + e);
            e.printStackTrace();
            throw e;
        }
    }

    private static ObservableList<MusicCategoryImpl> getMusicCategoryObjects(ResultSet rs)  throws SQLException, ClassNotFoundException {
        try {
            ObservableList<MusicCategoryImpl> categoriesList = FXCollections.observableArrayList();
            while(rs.next()) {
                MusicCategoryImpl mcl = new MusicCategoryImpl();
                mcl.setMusicCategoryName(rs.getString("MUS_CATEGORY"));
                categoriesList.add(mcl);
            }
            return categoriesList;
        } catch (SQLException e) {
            System.out.println("Error while making categories list" + e);
            e.printStackTrace();
            throw e;
        }
    }
    
    
}
