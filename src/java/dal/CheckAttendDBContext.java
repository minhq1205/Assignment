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
import model.CheckAttend;
import model.Session;
import model.Student;

/**
 *
 * @author DAT
 */
public class CheckAttendDBContext extends DBContext<CheckAttend> {

    public ArrayList<CheckAttend> listattendances(int id) {
        ArrayList<CheckAttend> listsatt = new ArrayList<>();
        try {
            String sql = " SELECT a.[sesid] \n"
                    + "      ,[stdid]\n"
                    + "      ,[student_status]\n"
                    + "  FROM [dbo].[CheckAttend] a\n"
                    + "  join Session s on s.sesid = a.sesid\n"
                    + "  where s.gid = ? ";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Session ses = new Session();
                Student s = new Student();
                CheckAttend a = new CheckAttend();

                ses.setId(rs.getInt("sesid"));

                a.setStudent_status(rs.getBoolean("student_status"));

                s.setId(rs.getString("stdid"));             

                a.setSession(ses);
                a.setStudent(s);
                listsatt.add(a);

            }

        } catch (SQLException ex) {
            Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listsatt;
    }

    @Override
    public void insert(CheckAttend model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(CheckAttend model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(CheckAttend model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CheckAttend get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<CheckAttend> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
