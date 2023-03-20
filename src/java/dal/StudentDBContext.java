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
import model.Group;
import model.Session;
import model.Student;

/**
 *
 * @author DAT
 */
public class StudentDBContext extends DBContext<Student> {

    public ArrayList<Student> listStudentInAGroup(int id) {
        ArrayList<Student> liststudent = new ArrayList<>();
        try {
            String sql = "SELECT s.stdid,s.stdcode,s.stdname\n"
                    + "FROM Student s\n"
                    + "INNER JOIN Student_Group sg ON sg.stdid = sg.stdid\n"
                    + "INNER JOIN [Group] g ON g.gid = sg.gid\n"
                    + "WHERE g.gid = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                Student s = new Student();
                s.setId(rs.getString("stdid"));
                s.setCode(rs.getString("stdcode"));
                s.setName(rs.getString("stdname"));

                liststudent.add(s);

            }

        } catch (SQLException ex) {
            Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return liststudent;
    }

    @Override
    public void insert(Student model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Student model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Student model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Student get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Student> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
