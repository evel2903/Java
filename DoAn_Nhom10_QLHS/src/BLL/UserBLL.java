/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.UserDAL;

/**
 *
 * @author hunte
 */
public class UserBLL {
    
    public boolean checkedUser(String username, String password){
        if (username.equals("") || password.equals("")) {
            return false;
        }
        return new UserDAL().checkedUser(username, password);
    }
}
