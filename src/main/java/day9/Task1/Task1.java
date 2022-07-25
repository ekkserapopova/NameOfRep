package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Катя", 9);
        Teacher teacher = new Teacher("Олег", "социология");
        System.out.println(student.getGroupName());
        student.printInfo();
        System.out.println();
        System.out.println(teacher.getSubjectName());
        teacher.printInfo();

    }
}
