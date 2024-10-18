/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*; //util package will have Scanner Class using which we can take user input from console.
public class ArrayTwoDimesnion
{
	public static void main(String[] args) {
     //3 classes with 4 Students in Each Class
     Scanner sc=new Scanner(System.in);//This allows us provide data to program from Console. 
     System.out.println("Please Enter the number of number of classess ");
     int cla=sc.nextInt();
     System.out.println("Please Enter the number of number of Students ");
     int st=sc.nextInt();
     int [][] ar=new int[cla][st];
      //System.out.println("Please Enter the Student Marks");
      
      for(int i=0;i<ar.length;i++)
      {
          for(int j=0;j<ar[i].length;j++)
          {
          System.out.println("Please Enter the "+(i+1)+" Class "+(j+1)+"Student Marks");
          ar[i][j]=sc.nextInt();
          }
      }
      System.out.println("The Marks of Students as follows");
      for(int i=0;i<ar.length;i++)
      {
          for(int j=0;j<ar[i].length;j++)
          {
          System.out.println("ar["+i+"]["+j+"] "+ar[i][j]);
         
          }
      }
     

	}
}