import java.util.*; //util package will have Scanner Class using which we can take user input from console.
public class ThreeDimensionRegular
{
	public static void main(String[] args) {
     //2 Collges 2 classes with 3 Students in Each Class
     Scanner sc=new Scanner(System.in);//This allows us provide data to program from Console. 
     //System.out.println("Please Enter the number of number of classess ");
     //int cla=sc.nextInt();
     //System.out.println("Please Enter the number of number of Students ");
     //int st=sc.nextInt();
     int [][][] ar=new int[2][3][3];
    /* ar[0]=new int[4];
     ar[1]=new int[2];
     ar[2]=new int[3];*/
     
      //System.out.println("Please Enter the Student Marks");
      
      for(int i=0;i<ar.length;i++)
      {
          for(int j=0;j<ar[i].length;j++)
          {
              for(int k=0;k<ar[i][j].length;k++){
          System.out.println("Please Enter the "+(i+1)+" College "+(j+1)+" Class "+(k+1)+" Studnet Marks");
          ar[i][j][k]=sc.nextInt();
          }
          } 
      }
      System.out.println("The Marks of Students as follows");
      for(int i=0;i<ar.length;i++)
      {
          for(int j=0;j<ar[i].length;j++)
          {
              for(int k=0;k<ar[i][j].length;k++){
          System.out.println("ar["+i+"]["+j+"]["+k+"] "+ar[i][j][k]);
          }
          } 
      }
     

	}
}