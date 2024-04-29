package exercises;

public class Exercise3 {

        public static void divide() {

            int[] inputs;

            while (true) {
                inputs = Exercise2.getUserInput();
                try{
                    System.out.println(inputs[0]/inputs[1]);
                    return;
                }catch (ArithmeticException e){
                    System.out.println("Cannot divide by zero please try again");
                }
            }

        }

    }

