package Controller.Interfaces;

import java.util.HashMap;

import Model.Student;

public interface iHashMap {
   
    public HashMap<Long,Student> getHashMap();
    public HashMap<Long, Student> getLongs();
    public void setLongs(HashMap<Long, Student> longs);
}
