package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    public void evaluate(Student student){
        int mark = (int)(Math.random() * 3 + 2);
        String marks = null;
        switch (mark){
            case 2:
                marks = "неудовлетворительно";
                break;
            case 3:
                marks = "удовлетворительно";
                break;
            case 4:
                marks = "хорошо";
                break;
            case 5:
                marks = "отлично";
                break;
            default:
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +  " по предмету " + subject +  " на оценку " + marks);
    }
}
