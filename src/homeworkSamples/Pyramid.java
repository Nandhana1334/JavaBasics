package homeworkSamples;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int i,j,n,s,k;
		   System.out.print ("Input number of rows : ");
		   Scanner in = new Scanner(System.in);
		   n = in.nextInt();

		   s=n+3-1;
		   for(i=1;i<=n;i++)
		   {
			   for(k=s;k!=0;k--)
			   {
				   System.out.print(" ");
			   }
			   for(j=1;j<=i;j++)
			   {
				   System.out.print(i+" ");
		       }
			System.out.println();
		    s--;
		   }
		}

	}


