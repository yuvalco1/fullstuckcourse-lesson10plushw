import java.util.*;

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



        int option = 0;
        while (option != 4) {
            System.out.println("Welcome to the Students system, Please choose an option: ");
            System.out.println("1 - add Student ; 2 - remove Student ; 3 - display all students ; 4 - quit");
            option = scanner.nextInt();
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

        }

        HashSet<String> names = new HashSet<>();
        names.add("Yuval");
        names.add("Itai");
        names.add("YuvalC");
        names.add("yuval");
        Iterator <String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Object max = Collections.max(names);

        System.out.println("Max is" + max);
        System.out.println("Min is" + Collections.min(names));

//        Home work slide 17
//        We use a HashSet to store unique usernames.
//        The program provides a simple menu for the user to add usernames, display the list of usernames, or exit the program. (1,2,3)
//        When adding a username, it checks if the username is already in the set and provides appropriate feedback.
//        The program continues to run until the user chooses to exit.

        HashSet<String> usernames = new HashSet<>();
        int selection = 0;
        while (selection != 3) {
            System.out.println("Welcome to the Usernames system, Please choose an option: ");
            System.out.println("1 - add Username ; 2 - display all usernames ; 3 - quit");
            selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Please enter Username name: ");
                    String name = scanner.next();
                    if (usernames.contains(name)) {
                        System.out.println("Username already exist !!");
                        break;
                    } else {
                        usernames.add(name);
                        break;
                    }
                case 2:
                    System.out.println("List of usernames:");
                    System.out.println(usernames);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
        }


        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person(20, "Yuval"));
        people.add(new Person(11, "Itai"));
        people.add(new Person(40, "YuvalC"));
        people.add(new Person(22, "yuval"));

        System.out.println("Before sorting: " + people);

        Collections.sort(people);

        System.out.println("After sorting: " + people);




    }


}