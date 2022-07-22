package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student1 = new Student("Лора Иванова");
        Student student2 = new Student("Петр Иванианин");
        Teacher teacher1 = new Teacher("Сергей Федорович", "математика");
        teacher1.evaluate(student1);
        teacher1.evaluate(student2);
    }
}
