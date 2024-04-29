package exercises;
import java.net.Socket;
import java.util.InputMismatchException;
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


    public void setInfo() {

        // Initiate Scanner
        Scanner scanner = new Scanner(System.in);

        // Set Age
        while (true) {
            try {
                // Age
                System.out.print("Enter your age: ");
                this.age = scanner.nextInt();
                if (this.age < 0) {
                    System.out.println("Enter valid age :");
                    scanner.next();
                    throw new InputMismatchException();
                } else {
                    break;
                }
            } catch (InputMismatchException im) {
                System.out.println("Invalid Data ");
                scanner.next();
            }
        }

        while (true) {
            try {
                // Height
                System.out.print("Enter your height (in metres): ");
                this.height = scanner.nextDouble();
                if (this.height < 3) {
                    System.out.println("Height Cant be more than 3m :");
                    scanner.next();
                    throw new InputMismatchException();
                } else {
                    break;
                }
            } catch (InputMismatchException i) {
                System.out.println("Invalid Data ");
                scanner.next();
            }
        }

        while (true) {
            try {
                // Weight
                System.out.print("Enter your weight (in kilograms): ");
                this.weight = scanner.nextDouble();
                break;
            } catch (InputMismatchException i) {
                System.out.println("Invalid Data ");
                scanner.next();
            }
        }

        while (true) {
            try {
                // Employment
                if (this.age > 16) {
                    System.out.print("Are you employed?: ");
                    this.isEmployed = scanner.nextBoolean();
                    break;

                }
            } catch (InputMismatchException i) {
                System.out.println("Invalid Data ");
                scanner.next();
            }
        }

        while (true) {
            try {
                // Occupation
                System.out.print("What is your occupation?: ");
                this.occupation = scanner.nextLine();
                scanner.next();
                break;
            } catch (InputMismatchException i) {
                System.out.println("Invalid Data ");
                scanner.next();
            }
        }

        while (true) {
            try {

                // Student
                if (!this.isEmployed) {
                    System.out.print("Are you a student?: ");
                    this.isStudent = scanner.nextBoolean();
                    break;

                }
            } catch (InputMismatchException im) {
                System.out.println("Invalid Data ");
                scanner.next();                                    //break;

            }
        }
    }


            public String getName () {
                return name;
            }

            public void setName (String name){
                this.name = name;
            }

            public int getAge () {
                return age;
            }

            public void setAge ( int age){
                this.age = age;
            }

            public double getHeight () {
                return height;
            }

            public void setHeight ( double height){
                this.height = height;
            }

            public double getWeight () {
                return weight;
            }

            public void setWeight ( double weight){
                this.weight = weight;
            }

            public boolean isEmployed () {
                return isEmployed;
            }

            public void setEmployed ( boolean employed){
                isEmployed = employed;
            }


            public String getOccupation () {
                return occupation;
            }

            public void setOccupation (String occupation){
                this.occupation = occupation;
            }

            public boolean isStudent () {
                return isStudent;
            }

            public void setStudent ( boolean student){
                isStudent = student;
            }
        }




