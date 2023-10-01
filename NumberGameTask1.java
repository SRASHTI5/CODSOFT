import java.util.*;
class NumberGameTask1{
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("--------------:WELCOME TO THE NUMBER GAME:------------");
        System.out.println("Following are the RULES-->");
        System.out.println("--->  You have 3 chances to predict the number\n If your predicted number is greater by 10 that means [Your Guess is HIGH] \n If your predicted number is smaller by 10 that means [Your Guess is LOW] \n If your predicted number is greater by 5 that means [Your Guess is CLOSER]\n If your predicted number is smaller by 5 that means [Your Guess is CLOSER]\n For any other case your Guess will be TOO HIGH or TOO LOW\n--->You can Quit the game, if you don't want to continue");
        System.out.println("-->For every CLOSE PREDICTION your points will be increased by 50 \n--> For every CORRECT GUESS your points will be increased by 100");
        System.out.println("_________Type y to START the GAME!!!_________");
        char choice=sc.next().charAt(0);
        System.out.println("Random number is: ");
        int randomnum=r.nextInt(1,100);
        System.out.println(randomnum);
        System.out.println("Guess the number: ");
        int guessnum=sc.nextInt();
        int point =0;
        for (int i=1;i<=3;i++)
        {
            while(choice=='y'){
            if(randomnum==guessnum) {
                System.out.println("Awesome! Your guessed number is CORRECT");
                point+=100;
            break;}
            else if (guessnum<randomnum) {
                if(guessnum<randomnum && guessnum>=randomnum-5){
                    System.out.println("You are <CLOSE> to the number:D");point+=50;break;}
                else if (randomnum-guessnum==1) {
                    System.out.println("You are <SUPER CLOSE> to the number");
                    point =point+95;break;
                } else if (guessnum<randomnum && guessnum>=randomnum-10) {
                    System.out.println("Your guess is low");break;
                } else {
                    System.out.println(":( your number is too low");
                    break;
                }

            }
            else if (guessnum>randomnum) {
                if(guessnum>randomnum && guessnum<=randomnum+5)
                {
                    System.out.println("You are <CLOSE> to the number:D");
                    point+=50;break;
                } else if (guessnum-randomnum==1) {
                    System.out.println("You are <SUPER CLOSE> to the number:D");
                    point+=95;break;
                } else if (guessnum>randomnum && guessnum<=randomnum+10) {
                    System.out.println("Your guess is high");break;
                } else {
                    System.out.println(":( your number is too high");
                    break;
                }
            }
            }
            System.out.println("Your points are: "+point);
            if(3-i==0){
                System.out.println("--------GAME OVER:)--------");break;
            }
            else{
                System.out.println("Want to Continue, your "+(3-i)+" Chances are reamining: \n Type y to continue OR Q to QUIT");
            choice=sc.next().charAt(0);
            System.out.println("Guess the number again!: ");
            guessnum=sc.nextInt();}

        }

    }
}

