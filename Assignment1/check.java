import java.util.Scanner;

class check{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
	   
	   System.out.println("enter number");
	   int num=sc.nextInt();
	   
	   if(num>0){
	      System.out.println("positive");
	   }
	   else if (num==0){
	       System.out.println("neither negative nor positive");
	   }
	   else{
	      System.out.println("negative");  
	   }
   }
}