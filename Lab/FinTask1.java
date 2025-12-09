import.java.util.Scanner

public class FinTask1 {

 class Student {
   private String name;
   public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
class School {
    private String schoolName;
    private Student[] students;
    private int count = 0;

    public School(String schoolName, int numberOfstudents) {
        this.schoolName = schoolName;
        this.students = new Student[numberOfstudents]; 
    }

    public void addstudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Cannot add more student " + schoolName);
        }
    }

    public void showstudents() {
        System.out.println("school " + schoolName);
        System.out.println("students");
        for (int i = 0; i < count; i++) {
            System.out.println(" - " + students[i].getName());
        }
    }
}
class Contact {
    private String contactnumber;

    public Contact(String contactnumber) {
        this.contactnumber = contactnumber;
       
    }

    public String getnumber() {
        return contactnumber  ;
    }
}


class StuDent{
    private String name;
    private Contact contactnumber; 
    public StuDent(String name, Contact contactnumber) {
        this.name = name;
        this.contactnumber = contactnumber;
    }

    public void showstudentInfo() {
        System.out.print("Student Name: " + name);
        System.out.println("Contact: " + contactnumber);
    }
}

// -------------------- MAIN --------------------
public class OneToOne_OneToMany {
    public static void main(String[] args) {

        
        School s = new School("Dhakaschool", 3);
        s.addstudent(new Student("Abrar Hasan"));
        s.addstudent(new Student("Kabir Khan"));
        s.addstudent(new Student("Rafsan Ali"));

        s.showstudents();

       
        Contact c = new Contact("214236566878");
        StuDent s1 = new StuDent("Ahmed Kabir", c);
        s1.showstudentInfo();

        Contact c1 = new Contact("214236566878");
        StuDent s2 = new StuDent("Ahmed Kabir", c1);
        s2.showstudentInfo();

        Contact c2 = new Contact("214236566878");
        StuDent s3 = new StuDent("Ahmed Kabir", c2);


        s3.showstudentInfo();
    }
}
}