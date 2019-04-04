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
public class AccountRegController {
    @FXML
    private TextField txtLogin;
    @FXML
    private TextField txtPassword;
    @FXML
    private TextField txtRepeatedPassword;
    @FXML
    private TextField txtEmail;
    @FXML
    private void insertAccount(ActionEvent event) throws ClassNotFoundException, SQLException  {
        try {
            AccountDAO.insertNewAccount(txtLogin.getText(), txtPassword.getText(), txtEmail.getText());
        } catch(SQLException e) {
            System.out.println("Exception occured in Insertion " + e);
            e.printStackTrace();
            throw e;
        }
    }
    
    @FXML
    private void goToLoginPage(ActionEvent event) throws IOException {
      try {
            Stage primaryStage = MainApplication.getPrimaryStage();
            Parent root = FXMLLoader.load(getClass().getResource("/spotify/controller/AccountLoginView.fxml"));
            Scene scene = new Scene(root, 800, 500);
            primaryStage.setScene(scene);
        } catch (IOException e) {
            System.out.println("Error occured while changing to LoginView" + e);
            e.printStackTrace();
            throw e;
        }
    }
}
