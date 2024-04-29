package exercises;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {
//    int divisor;
//    int dividend;
    public static int[] getUserInput() {
        int[] result = new int[2];
        Scanner scanner = new Scanner(System.in);

            while (true) {

                try {
                    System.out.println("Enter divisor :");
                    int divisor = scanner.nextInt();
                    result[0] = divisor;


                    System.out.println("Enter dividend :");
                    int dividend = scanner.nextInt();
                    result[1] = dividend;
                    if (result[0] < 0){
                        throw new NegativeIntegerInputException("Negative input",);
                    }

                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. ");
                    scanner.next();
                }



            }
        return result ;

    }

    }

