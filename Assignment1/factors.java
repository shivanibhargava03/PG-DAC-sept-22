import java.util.Scanner;

class factors{
   public static void main(String[] agrs){
   
     Scanner sc= new Scanner(System.in);
	 System.out.println("enter number");
	 int num=sc.nextInt();
	 
	 for(int i=1;i<num;i++){
	    if(num%i==0){
		   System.out.println(i);
		}
	 }
   }
}