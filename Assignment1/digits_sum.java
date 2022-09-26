import java.util.Scanner;

class digits_sum{
    public static void main(String[] args){
	    
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		int rem;
		int sum=0;
		while(num>0){
		   rem=num%10;
		  
		   sum=sum+rem;
		   
		   num=(num-rem)/10;
		
		}
		
		System.out.println(sum);
		
	}
}