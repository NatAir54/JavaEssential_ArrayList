package task_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myTeachers = new ArrayList<>();
        myTeachers.add( "Galina Vasilievna" );
        myTeachers.add( "Alla Ivanovna" );
        myTeachers.add( "Korney Stephanovich" );
        myTeachers.add( "Tatyana Ivanovna" );
        myTeachers.add( "History teacher" );
        myTeachers.add( "Chemistry teacher" );
        System.out.println(myTeachers);

        System.out.println("Index of my best teacher: " + myTeachers.indexOf("Alla Ivanovna"));
        System.out.println("Index of my worst teacher: " + myTeachers.indexOf("Chemistry teacher"));

    }
}
