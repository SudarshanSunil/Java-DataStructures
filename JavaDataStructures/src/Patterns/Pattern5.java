package Patterns;
import java.util.Scanner;
/*Write a program to print the below pattern
 * * * * *
 * * * *
 * * *
 * *
 *

 */
public class Pattern5 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int noOfRows=sc.nextInt();
        for(int i=0;i<noOfRows;i++)
        {
            for(int j=noOfRows;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
