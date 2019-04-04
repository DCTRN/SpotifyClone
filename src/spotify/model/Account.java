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
public class Account {
    private StringProperty Login;
    private StringProperty Password;
    private StringProperty Email;
    
    public Account() {
        this.Login = new SimpleStringProperty();
        this.Password = new SimpleStringProperty();
        this.Email = new SimpleStringProperty();
    }
    
    public void setAccountLogin(String LOGIN) {
        Login.set(LOGIN);
    }
    
    public String getAccountLogin() {
        return Login.get();
    }
    
    public StringProperty getAccountLoginProperty() {
        return Login;
    }
    
    public void setAccountPassword(String PASSWORD) {
        Password.set(PASSWORD);
    }
    
    public String getAccountPassword() {
        return Password.get();
    }
    
    public StringProperty getAccountPasswordProperty() {
        return Password;
    }
    
    public void setAccountEmail(String EMAIL) {
        Email.set(EMAIL);
    }
    
    public String getAccountEmail() {
        return Email.get();
    }
    
    public StringProperty getAccountEmailProperty() {
        return Email;
    }
    
}
