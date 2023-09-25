package Model;

import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;

public class ModelClassList implements iGetModel {
    private List<Student> students;

    public ModelClassList (List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

 
}

   

