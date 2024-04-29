package exercises;
import java.util.Scanner;


public class Person {
    String name;
    int age;
    double height;
    double weight;
    boolean isEmployed;
    String occupation;
    boolean isStudent;

    public Person(String name) {
        this.name = name;
    }


    public void setInfo(){
        Scanner scanner = new Scanner(System.in);
        // Age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Height
        System.out.print("Enter your height (in metres): ");
        double height = scanner.nextDouble();

        // Weight
        System.out.print("Enter your weight (in kilograms): ");
        double weight = scanner.nextDouble();

        // Employment
        if(age > 16) {
            System.out.print("Are you employed?: ");
            boolean employed = scanner.nextBoolean();
            scanner.nextLine();
        }

        // Occupation
        System.out.print("What is your occupation?: ");
        String occupation = scanner.nextLine();

        // Student
        if (!isEmployed) {
            System.out.print("Are you a student?: ");
            boolean isStudent = scanner.nextBoolean();

        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }


    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }
}
