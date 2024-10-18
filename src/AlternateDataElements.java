/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*; //util package will have Scanner Class using which we can take user input from console.
public class AlternateDataElements
{
	public static void main(String[] args) {
     
     int[] a=new int[4];
     a[0]=10;
     a[1]=20;
     a[2]=30;
     a[3]=40;
     for (int i =0;i<a.length;i=i+2)
     {
         System.out.println(a[i]);
     }
     


	}
}