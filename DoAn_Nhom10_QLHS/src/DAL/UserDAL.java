/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.UserDTO;
import UTILS.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hunte
 */
public class UserDAL {
    private ConnectionUtil conUtil;
    private Connection con;
    private PreparedStatement preparedStatement;

    public ArrayList<UserDTO> getAllUser(){
        ArrayList<UserDTO> allUser = new ArrayList<>();
        conUtil = new ConnectionUtil();
        con = conUtil.getConnection();
        Statement st;
        ResultSet rs;
        
        final String sql = "SELECT * FROM `user`";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                UserDTO user = new UserDTO(
                        rs.getInt("userid"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getInt("level")
                );
                allUser.add(user);              
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allUser;
    }
    public boolean checkedUser(String username, String password){
        ArrayList<UserDTO> allUser = getAllUser();
        for (UserDTO userDTO : allUser) {
            if (userDTO.getUsername().equals(username) && userDTO.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
