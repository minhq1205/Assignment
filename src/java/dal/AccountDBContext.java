/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author sonnt
 */
public class AccountDBContext extends DBContext<Account> {

    public Account get(String username, String password) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        String sql = "SELECT [username]\n"
                + "      ,[password]\n"
                + "      ,[displayname]\n"
                + "  FROM [User]\n"
                + "  WHERE [username] = ?\n"
                + "  AND [password] = ?";
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            rs = stm.executeQuery();
            
            if(rs.next())
            {
                Account s = new Account();
                s.setUsername(rs.getString("username"));
                s.setDisplayname(rs.getString("displayname"));
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                rs.close();
                stm.close();
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
        
    }

    @Override
    public void insert(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Account model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Account get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Account> all() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
