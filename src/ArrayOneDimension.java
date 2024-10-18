import java.util.*; //util package will have Scanner Class using which we can take user input from console.
public class ArrayOneDimension
{
	public static void main(String[] args) {
     
     Scanner sc=new Scanner(System.in);//This allows us provide data to program from Console. 
     System.out.println("Please Enter the number of Students");
     int size=sc.nextInt();
     int [] ar=new int[size];
      //System.out.println("Please Enter the Student Marks");
      
      for(int i=0;i<ar.length;i++)
      {
          System.out.println("Please Enter the "+(i+1)+" Student Marks");
          ar[i]=sc.nextInt();
      }
      System.out.println("The Marks of Students as follows");
      for(int i=0;i<ar.length;i++)
      {
          System.out.print(ar[i]+" ");
         // ar[0]=sc.nextInt();
      } 
     

	}
}