package Model;



public class StudentEngl extends Person implements Comparable<StudentEngl> {
    private int id;
    private static int generalId;

    public int getId() {
        return id;
    }

    public StudentEngl(String name, int age) {
        super(name, age);
      
        this.id = generalId;
        generalId++;
    }

    @Override
    public String toString() {
        return "StudentEngl=" + super.getName() + ", age=" + super.getAge() + "id =" + id + "]";
    }

    @Override
    public int compareTo(StudentEngl x) {
        
        System.out.println(super.getName() + " - " + x.getName());
        if (super.getAge() == x.getAge()) {


        return 0;
    }
    else {
        if (super.getAge() > x.getAge()) {
            return 1;
        }

        else {
            return -1;
        }

    
}
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getGeneralId() {
        return generalId;
    }

    public static void setGeneralId(int generalId) {
        StudentEngl.generalId = generalId;
    }
}