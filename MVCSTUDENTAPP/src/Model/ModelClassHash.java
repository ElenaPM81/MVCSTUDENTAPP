package Model;

import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iHashMap;

public class ModelClassHash implements iHashMap{
    private HashMap<Long,Student> longs;
    
       public ModelClassHash(HashMap<Long,Student> longs) {
        this.longs = longs;
    }

    public HashMap<Long,Student> getHashMap() {
        return longs;
    }

    public HashMap<Long, Student> getLongs() {
        return longs;
    }

    public void setLongs(HashMap<Long, Student> longs) {
        this.longs = longs;
    }

  
}
