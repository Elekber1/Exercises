package video;

public class Main {

    public static void main(String[] args) {
    Teacher t = new Teacher(22, "Samir", "Aliyev");
    Student s = new Student(27, "Alakbar", "Hajizada");

    Student[] arr = new Student[2];
    arr[0] = s;
    t.setStudents(arr);


    Student[] studentsofTeacher = t.getStudents();
    Student index0 = studentsofTeacher[0];
        System.out.println(t.getStudents()[0].getName());
    }
}
