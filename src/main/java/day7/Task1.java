package day7;

import day6.Airplane;

public class Task1 {
    public static void main(String[] args) {
        day7.Airplane airplane1 = new day7.Airplane("Man", 2000, 376.0, 1111.0);
        day7.Airplane airplane4 = new day7.Airplane("Woman", 2003, 375.9, 1200.0);
        day7.Airplane.compareAirplanes(airplane1, airplane4);


    }
}