import java.io.*;

class Number
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number: ");
        int n = Integer.parseInt(br.readLine());

        int ch;

        do
        {
            System.out.println("\n1 Prime");
            System.out.println("2 Palindrome");
            System.out.println("3 Armstrong");
            System.out.println("4 Sum of Digits");
            System.out.println("5 Reverse");
            System.out.println("6 Exit");

            System.out.print("Enter choice: ");
            ch = Integer.parseInt(br.readLine());

            if(ch == 1)
            {
                int count = 0;

                for(int i = 1; i <= n; i++)
                {
                    if(n % i == 0)
                        count++;
                }

                if(count == 2)
                    System.out.println("Prime");
                else
                    System.out.println("Not Prime");
            }

            else if(ch == 2)
            {
                int x = n, rev = 0;

                while(x > 0)
                {
                    rev = rev * 10 + x % 10;
                    x = x / 10;
                }

                if(n == rev)
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");
            }

            else if(ch == 3)
            {
                int x = n, sum = 0;

                while(x > 0)
                {
                    int d = x % 10;
                    sum = sum + d * d * d;
                    x = x / 10;
                }

                if(n == sum)
                    System.out.println("Armstrong");
                else
                    System.out.println("Not Armstrong");
            }

            else if(ch == 4)
            {
                int x = n, sum = 0;

                while(x > 0)
                {
                    sum = sum + x % 10;
                    x = x / 10;
                }

                System.out.println("Sum = " + sum);
            }

            else if(ch == 5)
            {
                int x = n, rev = 0;

                while(x > 0)
                {
                    rev = rev * 10 + x % 10;
                    x = x / 10;
                }

                System.out.println("Reverse = " + rev);
            }

            else if(ch == 6)
            {
                System.out.println("Exit");
            }

            else
            {
                System.out.println("Wrong Choice");
            }

        } while(ch != 6);
    }
}
