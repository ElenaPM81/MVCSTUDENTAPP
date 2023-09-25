import java.util.ArrayList;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.StudentEngl;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassFile;
import Model.ModelClassList;
import Model.Student;

import View.ViewClass;
import View.ViewClassEng;

public class App {
    public static void main(String[] args) throws Exception {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("Сергей", 21);
        Student s2 = new Student("Николай", 22);
        Student s3 = new Student("Виктория", 39);
        Student s4 = new Student("Надежда", 30);
        Student s5 = new Student("Варвара", 23);
        Student s6 = new Student("Захар", 21);
        Student s7 = new Student("Иван", 27);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);


        
        List<StudentEngl> engStudents = new ArrayList<>();
        StudentEngl s8 = new Student("Sergey", 21);
        StudentEngl s9= new Student("Nikolay", 22);
        StudentEngl s10 = new Student("Viktoria", 39);
        StudentEngl s11 = new Student("Nadejda", 30);
        StudentEngl s12 = new Student("Varvara", 23);
        StudentEngl s13 = new Student("Zahar", 21);
        StudentEngl s14 = new Student("Ivan", 27);

        engStudents.add(s8);
        engStudents.add(s9);
        engStudents.add(s10);
        engStudents.add(s11);
        engStudents.add(s12);
        engStudents.add(s13);
        engStudents.add(s14);



        ModelClassFile fModel = new ModelClassFile("StudentDB.csv");
        // fModel.saveAllStudentToFile(students);
        // ModelClassList modelList = new ModelClassList((students));
        // ViewClass view = new ViewClass();
        iGetModel modelList = fModel;
        iGetView view = new ViewClass();
      
        


         
        ControllerClass controller = new ControllerClass((modelList), view);
        // controller.update();
        controller.run();
    
    
    }
}
