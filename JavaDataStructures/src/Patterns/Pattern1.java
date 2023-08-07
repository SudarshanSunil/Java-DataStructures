package Patterns;
import java.util.Scanner;
/*Write a program to print the below pattern
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * * */
public class Pattern1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int noOfrows=sc.nextInt();
        for(int i=0;i<noOfrows;i++)
        {
            for(int j=0;j<noOfrows;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
