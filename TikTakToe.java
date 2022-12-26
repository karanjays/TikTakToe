import java.util.Scanner;

public class TikTakToe
{
    public static void main(String[] args)
    {
        int n=0;
        int i;
        char[] game={' ',' ',' ',' ',' ',' ',' ',' ',' '};
        char turn='X';
        Scanner sc=new Scanner(System.in);
        while(true)
        { 
            do
            {
                System.out.print("Enter your position :- "); 
                i=sc.nextInt();
            }
            while(game[i-1]!=' ');

            
            System.out.print("\033[H\033[2J");  
            System.out.flush(); 
            game[i-1]=turn;


            System.out.println("\n " + game[0] + " | " + game[1] + " | " + game[2] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + game[3] + " | " + game[4] + " | " + game[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + game[6] + " | " + game[7] + " | " + game[8] + " \n"); 

            if( (game[0]==turn && game[1]==turn && game[2]==turn) || (game[3]==turn && game[4]==turn && game[5]==turn) || (game[6]==turn && game[7]==turn && game[8]==turn) || (game[0]==turn && game[3]==turn && game[6]==turn) || (game[1]==turn && game[4]==turn && game[7]==turn) || (game[2]==turn && game[5]==turn && game[8]==turn) || (game[0]==turn && game[4]==turn && game[8]==turn) || (game[4]==turn && game[2]==turn && game[6]==turn))
            {
                System.out.println(turn + " is Winner");
                break;
            }

            if(turn == 'X')
                turn='O';
            else
                turn='X';

            ++n;
            if(n==9)
            {
                System.out.println("Match DRAW !!!");
                break;
            }
            
        }
    }
}