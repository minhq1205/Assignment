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
public class Student {
   private String id;
    private String code;
    private String name;

    
    private ArrayList<Group> groups = new ArrayList<>();
    private ArrayList<CheckAttend> atts = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public ArrayList<CheckAttend> getAtts() {
        return atts;
    }

    public void setAtts(ArrayList<CheckAttend> atts) {
        this.atts = atts;
    }
    
}
