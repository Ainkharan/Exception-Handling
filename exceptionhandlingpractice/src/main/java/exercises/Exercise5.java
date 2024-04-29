package exercises;
import java.util.Scanner;

/*
You cannot be both employed and a student.
You cannot be employed below the age of 16.
A full name should consist of at least a forename and surname, separated by a space.
All values should be within the realms of plausibility - age can't be negative, height can't be 10km, etc.
*/


    public class Exercise5 {

        public static void healthInsuranceDataInput() {

            Scanner scanner = new Scanner(System.in);

            // Print introduction
            System.out.println("\n--- Thank you for choosing Blummin Health insurance! ---\n");
            System.out.println("Please input your data:");

            // Enter name and create Person object
            String name = "";
            while (true) {
                System.out.print("Enter your full name (format is first name, space, second name): ");
                name = scanner.nextLine();
                if (name.matches("^[A-Z][a-z]+\s[A-Z][a-z]+$")){
                    break;
                }

            }
            Person person = new Person(name);

            // Set information in current person
            person.setInfo();

            // Calculate Charge
            double charge = Calculators.calculateSubscriptionCharge(
                    person.getAge(),
                    person.getHeight(),
                    person.getWeight(),
                    person.getOccupation(),
                    person.isStudent());

            System.out.println("\nThank you, " + name + ", for providing your information!");
            System.out.println("Your Blummin monthly subscription is: £" + charge);

            scanner.close();
        }

    }
