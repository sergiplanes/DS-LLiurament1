/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author sergi
 */
public class Login {
    public boolean validatePassword(String username, String password) {
        return username.equals("sergi") && password.equals("@bc123456789");
    }
}
