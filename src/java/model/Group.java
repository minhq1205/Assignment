/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Group {
    private int id;
    private String name;
    private Course cname; 
    private Lecturer lecturer;
    private ArrayList<Session> sessions = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    public Group() {
    }

    public Group(int id, String name, Course cname, Lecturer lecturer) {
        this.id = id;
        this.name = name;
        this.cname = cname;
        this.lecturer = lecturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCname() {
        return cname;
    }

    public void setCname(Course cname) {
        this.cname = cname;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public ArrayList<Session> getSessions() {
        return sessions;
    }

    public void setSessions(ArrayList<Session> sessions) {
        this.sessions = sessions;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    
}
