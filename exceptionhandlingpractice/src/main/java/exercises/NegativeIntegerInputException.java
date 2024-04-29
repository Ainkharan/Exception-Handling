package exercises;

public class NegativeIntegerInputException extends Throwable{

    public void message(int input){
        System.out.println("The following negative integer(s) are not allowed in this operation: " + input);
    }

}
