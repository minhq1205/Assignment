package model;


import java.util.ArrayList;


public class TimeSlot {
    private int id;
    private String slotTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(String slotTime) {
        this.slotTime = slotTime;
    }


    public ArrayList<Session> getSessions() {
        return sessions;
    }

    public void setSessions(ArrayList<Session> sessions) {
        this.sessions = sessions;
    }
    private ArrayList<Session> sessions = new ArrayList<>();
}
