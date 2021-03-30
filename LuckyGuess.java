import java.util.*;
class LuckyGuess
{
    public static void main()
    {
        Random n = new Random();
        int n1= n.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        int i=1;
        for(;;)
        {
            if(i>0)
            {
                int num = sc.nextInt();
                if(num==n1)
                {
                    System.out.println("Congratulations!! You Guessed it right");
                    break;
                }
                else if(num>n1)
                {
                    System.out.println("Wrong Guess!! Choose a Smaller number");
                }
                else if(num<n1)
                {
                    System.out.println("Wrong Guess!! Choose a Larger number");
                }
                i++;
            }
        }
        System.out.println(i+" attempts");
    }
}