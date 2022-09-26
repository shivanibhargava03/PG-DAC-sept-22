import java.util.Scanner;

class digits{
    public static void main(String[] args){
	    
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		int rem;
		while(num>0){
		   rem=num%10;
		   System.out.println(rem);
		   
		   num=(num-rem)/10;
		
		}
		
		
	}
}