import java.util.Scanner;

/**
 * Create a class GAME with a method name()
 */
class GAME{
    void name(){
        System.out.println("ROCK-PAPER-SCISSOR");
    }
}

/**
 * Create subclasses: Rock, Paper and Scissor
 * Overriding the method name to display object names
 * (Rock, Paper, Scissor)
 */
class Rock extends GAME{
    void name(){
        System.out.println("Rock");
    }
}

class Paper extends GAME{
    void name(){
        System.out.println("Paper");
    }
}

class Scissor extends GAME{
    void name(){
        System.out.println("Scissor");
    }
}

/**
 * Class PlayGame to assign objects of GAME; 
 */
class PlayGame{
    public static void main(String[] args){
        
        //initialising user to null value
        GAME user = null;
        
        //obtain a reference of type GAME  
        GAME computer;

        Rock r = new Rock(); // object of type Rock
        Paper p = new Paper(); // object of type Paper
        Scissor s = new Scissor(); // object of Scissor
        
        Scanner sc = new Scanner(System.in);
        
        /**
         * Prompt Welcome message to the user.
         */
        System.out.println("WELCOME TO ROCK-PAPER-SCISSOR GAME");
        System.out.println("=====================================");

outer: do{ // label "outer" to indentify a block of code(do-while loop)
            
            /**
             * User's choice:
             * "1 : Rock
             * "2 : Paper
             * "3 : Scissor
             * "4 : Quit
             */
            System.out.println("1 - Rock\n2 - Paper\n3 - Scissor\n4 - Exit");
            System.out.println("Enter your choice!!");
            System.out.println("=====================================");
            int Obj = sc.nextInt();
            
            //switch case to process the user choice
            switch (Obj){
                case 1:
                    user = r; //assigns user to Rock
                    break;
                case 2:
                    user = p; //assigns user to Paper
                    break;
                case 3:
                    user = s; //assigns user to Scissor
                    break;
                case 4:
                    break outer; // exits the do-while loop and stops the infinite loop.
                default:
                    System.out.println("Invalid input! Try again..");
                    continue outer; // to jump to the do-while loop 
            }

            /**
             * COMPUTER RESPONSE
             * Random function generates random number between 1-3 and 
             * assigns user to Rock, Paper or Scissor depeding on the number generated
             * 1: Rock
             * 2: Paper
             * 3: Scissor
             *
             */
            int x = ((int) ((Math.random())*3))+1;
            if (x==1) computer = r;
            else if (x==2) computer = p;
            else computer = s;
            System.out.println("=====================================");

            /**
             * if-else statements to deciding the winner
             *
             */
            if ((user instanceof Rock && computer instanceof Rock) || (user instanceof Paper && computer instanceof Paper) || (user instanceof Scissor && computer instanceof Scissor)){
                System.out.print("Player: "); user.name(); //calls overridden version of name method
                System.out.print("Computer: "); computer.name(); //calls overridden version of name method
                System.out.println("=====================================");
                System.out.println("Draw");
                System.out.println("=====================================");
            }
            else if ((user instanceof Rock && computer instanceof Scissor) || (user instanceof Paper && computer instanceof Rock) || (user instanceof Scissor && computer instanceof Paper)){
                System.out.print("Player: "); user.name(); //calls overridden version of name method
                System.out.print("Computer: "); computer.name();  //calls overridden version of name method             
                System.out.println("=====================================");
                System.out.println("Player Wins!");
                System.out.println("=====================================");
            }
            else {
                System.out.print("Player: "); user.name(); //calls overridden version of name method
                System.out.print("Computer: "); computer.name(); //calls overridden version of name method
                System.out.println("=====================================");
                System.out.println("Computer Wins!");
                System.out.println("=====================================");

            }
       } while(1!=0); //infinite loop to prompt user menu until user exits
    }
}
