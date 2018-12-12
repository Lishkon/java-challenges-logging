package HackerRank.CodingDays30;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

import static jdk.nashorn.internal.parser.TokenType.CASE;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    public char calculate() {
        int averageScore = 0;
        int total = 0;
        char mark = Character.MIN_VALUE;
        for (int t : testScores) {
            total+=t;
        }
        averageScore = total/testScores.length;

        if (averageScore>=90 && averageScore<=100) {
            mark = 'O';
        }

        if (averageScore>=80 && averageScore<90) {
            mark = 'E';
        }

        if (averageScore>=70 && averageScore<80) {
            mark = 'A';
        }

        if (averageScore>=55 && averageScore<70) {
            mark = 'P';
        }

        if (averageScore>=40 && averageScore<55) {
            mark = 'D';
        }

        if (averageScore<40) {
            mark = 'T';
        }


        return mark;
    }
}
public class Day12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
