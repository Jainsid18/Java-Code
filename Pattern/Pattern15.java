import java.util.*;

class Pattern15
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int st = 1;

        for(int i = 1; i <= 2*n - 1; i++)
        {
            // Spaces
            if(i != n)
            {
                for(int j = 1; j < n; j++)
                {
                    System.out.print(" ");
                }
            }

            // Middle row
            if(i == n)
            {
                st = 2*n - 1;
            }

            // Stars
            for(int j = 1; j <= st; j++)
            {
                System.out.print("*");
            }

            // Update stars
            if(i < n)
            {
                st++;
            }
            else if(i == n)
            {
                st = n - 1;
            }
            else
            {
                st--;
            }

            System.out.println();
        }
    }
}

/*Enter a number:
5
    *
    **
    ***
    ****
*********
    ****
    ***
    **
    *
	
*/