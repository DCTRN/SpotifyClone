    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify.controller;

import java.io.IOException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import spotify.main.MainApplication;
import spotify.model.AccountDAO;

/**
 *
 * @author Michal
 */
public class AccountLoginController {
    @FXML
    private TextField txtLogin;
    @FXML
    private TextField txtPassword;
    
    @FXML
    private void login(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {
        try {
            if (AccountDAO.checkAccount(txtLogin.getText(), txtPassword.getText())){
                System.out.println("Logging succesful!");
                //change stage to main 
                Stage mainAppStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("/spotify/controller/MainAppView.fxml"));
                Scene scene = new Scene(root, 1600 , 900);
                scene.getStylesheets().add("/spotify/controller/mainStyle.css");
                mainAppStage.setScene(scene);
                MainApplication.disablePrimaryStage();
                mainAppStage.show();
                
            }
        } catch(SQLException e) {
            System.out.println("Error occured while logging" + e);
            e.printStackTrace();
            throw e;
        }
    }
    
    @FXML private void registrationPage(ActionEvent event) throws IOException {
        try {
            Stage primaryStage = MainApplication.getPrimaryStage();
            Parent root = FXMLLoader.load(getClass().getResource("/spotify/controller/AccountRegView.fxml"));
            Scene scene = new Scene(root, 800, 600);
            primaryStage.setScene(scene);
        } catch (IOException e) {
            System.out.println("Error occured while changing to RegView" + e);
            e.printStackTrace();
            throw e;
        }
        
    }
    
}
