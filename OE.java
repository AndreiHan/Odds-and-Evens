import java.util.*;
class OE{
    public static void main(String[] args) {
        int scor;
        Scanner input = new Scanner(System.in);

        System.out.println("Lets play a game called Odds and Evens " );
        System.out.println(" ");
        System.out.println("What is your name? ");
        String name = input.next();
        int again;
        System.out.println("Hello " + name);
        do{
            game();
            System.out.println("Do you want to play again? 1/0");
            again = input.nextInt();

            
        }while(again == 1);
       

    }

    public static void game() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which one do you choose? (O)dds or (E)vens ?");
        String option = input.next();
        String optionA = "O";
        System.out.println("----------------------------");
        if(option.equals(optionA)){
            System.out.println("OK, i will be Evens then ");
        }
        else {
            System.out.println("OK, i will be Odds then ");
        }

        System.out.println(" ");

        System.out.println("How many fingers do you put out? ");
        int fingers = input.nextInt();

        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println(" ");
        System.out.println("I put "+computer+" fingers");
        System.out.println("----------------------------");
        int sum = fingers + computer;

        if(sum % 2 == 0 )
        {
            System.out.println(sum + " is Even");
            System.out.println("----------------------------");
            if(option.equals("E") )
            {
                System.out.println("You won !");
            }
            else
                System.out.println("I am the winner");
        }
        else
           { System.out.println(sum + " is Odd ");
           System.out.println("----------------------------");
            if(option.equals("O") )
            {
                System.out.println("You won !");

            }
            else
                System.out.println("I am the winner");

        }
        
    }

}