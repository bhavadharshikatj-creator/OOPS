import java.util.Scanner;

public class ConditionalStatements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        
        if(num > 0)
        {
            System.out.println("Number is positive");
        }

        
        if(num % 2 == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }

        
        switch(num)
        {
            case 1:
                System.out.println("You entered ONE");
                break;

            case 2:
                System.out.println("You entered TWO");
                break;

            case 3:
                System.out.println("You entered THREE");
                break;

            default:
                System.out.println("Number is not 1,2 or 3");
        }

        
        System.out.println("Jumping statement demonstration:");

        for(int i = 1; i <= 5; i++)
        {
            if(i == 3)
            {
                continue;   
            }

            if(i == 5)
            {
                break;      
            }

            System.out.println(i);
        }

        return; 
    }
}