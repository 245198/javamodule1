package Demo2;

import java.util.*;
import java.io.*;

class A{
    static void printSeries(int a,int b,int n)
    {
        int [] arr = new int[15];
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<=i;j++)
            {
            	double sum = a;
            	for(int m=0;m<=i;m++)
            	{
                double k = (double)j;
                sum = sum+(Math.pow(2,m)*b);
            	}
            	int nsum= (int)sum;
                System.out.print(nsum+" ");
            }
           
    
        }
       
    }
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of series: ");
        int t=in.nextInt();
        
        for(int i=0;i<t;i++)
        {
        	System.out.println("Enter values of a,b,n");
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printSeries(a,b,n);
            
        }
    
        in.close();
    }
}
