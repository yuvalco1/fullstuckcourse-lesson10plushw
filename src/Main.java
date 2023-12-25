import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Car car = new Car("Ford");
        car.display();
        car.engine.setHorsepower(200);
        car.display();


//    Create a HashMap to store student records. The key should be the student's name (a String), and the value should be the student's GPA (a Double).
//    Implement a menu-driven program that allows the user to perform the following actions:
//    Add a student record: Prompt the user for the student's name and GPA, and add it to the HashMap.
//    Remove a student record: Prompt the user for a student's name and remove it from the HashMap.
//    Display all student records: Display the names and GPAs of all students in the HashMap.
//    Quit: Exit the program.
//    Use a loop to repeatedly display the menu and execute the selected action until the user chooses to quit.

        HashMap<String, Double> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Students system, Please choose an option: ");
        System.out.println("1 - add Student ; 2 - remove Student ; 3 - display all students ; 4 - quit");

        int option = scanner.nextInt();
        while (option != 4) {
            switch (option) {
                case 1:
                    System.out.println("Please enter student name: ");
                    String name = scanner.next();
                    System.out.println("Please enter student GPA: ");
                    Double gpa = scanner.nextDouble();
                    students.put(name, gpa);
                    break;
                case 2:
                    System.out.println("Please enter student name: ");
                    String nameToRemove = scanner.next();
                    students.remove(nameToRemove);
                    break;
                case 3:
                    System.out.println(students);
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
            System.out.println("Welcome to the Students system, Please choose an option: ");
            System.out.println("1 - add Student ; 2 - remove Student ; 3 - display all students ; 4 - quit");
            option = scanner.nextInt();
        }

    }


}