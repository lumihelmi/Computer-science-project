import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's explore some probabilities.");
        System.out.println("Pick a random number from 1 to 10: ");
        try {
            int userInput = scanner.nextInt();
            //see if the input is within the given range
            if (userInput >= 1 && userInput <= 10) {
                //array of responses
                String[] answer = {"Surprisingly, this is an uncommon answer (only ~3.4% of people pick it)", "I wasn't expecting this one (~8.5% of people pick it).", "We all like triangles (~9.7% of people pick this one).", "I wouldn't guess this one, although it isn't too rare (~9.7% of people pick it).", "Very predictable (2nd most common answer with ~12.3%)", "It's a boring answer (~9.8% of people pick it). ", "We all knew this was coming (~28% of people pick 7)", "really mid... ~10.8% of people pick this.", "You're pretty random (~5.3% of people pick this one)", "You're quite unique (~1.9% pick this, making it the rarest choice)"};
                //print response matching with the user's input
                System.out.println(answer[userInput - 1]);
            } else {
                //inform that the input is not within given range
                System.out.println("Number is not within the range 1-10. Did you know that 0.5% of people answer zero when asked this question?");
            }
        } catch (Exception e) {
            System.out.println(e);
            //stop program, error code 1
            System.exit(1);
        }

        System.out.println("Now, try to guess which colour I'm thinking of. " +
                "(Don't capitalize)");
        try {
            String colour = scanner.next();
            //loop to ask for the colour until user guesses it
            while (!colour.equals("blue")) {
                System.out.println("Good try. Guess again :D");
                colour = scanner.next();
            }
            //inform that user guessed correctly
            System.out.println("You're right, congratulations!");
        } catch (Exception e) {
            System.out.println(e);
            //stop program, error code 1
            System.exit(1);
        }
    }
}