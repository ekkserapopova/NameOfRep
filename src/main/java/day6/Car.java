package day6;

public class Car {
        private String model;
        private String color;
        private int yearOfIssue;

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getYearOfIssue() {
            return yearOfIssue;
        }
        public void setModel(String model){
            this.model = model;
        }
        public void setColor(String color){
            this.color = color;
        }
        public void setYearOfIssue(int yearOfIssue){
            this.yearOfIssue = yearOfIssue;
        }
        public void info(){
            System.out.println("Это автомобиль");
        }
        public int yearDifference(int inputYear){
            return Math.abs(yearOfIssue - inputYear);
        }
}
