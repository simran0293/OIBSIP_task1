import java.util.Random;
import java.util.Scanner;
/*
1. There is a constructor to generate the random no.
2. takeUserInput to take input from the user
3. isCorrectNumber to check whether the number entered is correct or not
4. Getters and setters for no of guesses.

 we will use properties such as noOfGuesses(int)
*/

class Game{
    public static void main(String args[])
    {
        Random rand=new Random();
        int randomNumber=rand.nextInt(100)+1;
        int trycount=0;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter your guess(1-100) : ");
       
        int playerGuess = sc.nextInt();
        trycount++;
        if(playerGuess==randomNumber)
        {
            System.out.println("Correct!! You got it.");
            System.out.println("It took you "+trycount+ " tries.");
            break;
        }
        else if(randomNumber > playerGuess)
        {
            System.out.println("Nope! The no. is higher. Guess Again");
        }
        else{
            System.out.println("Nope! The no. is lesser. Guess Again");
        }
        
        }
        sc.close();

    }
}