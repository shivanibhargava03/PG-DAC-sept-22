import java.util.Scanner;

class palindrome{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num= sc.nextInt();
		
		int n=num;
		int rem;
	    int n2=0;
		
		while(n>0){
		    rem = n % 10;
			n2=n2*10+rem;
			n=n/10;
			
		}
		
		if(num==n2){
			System.out.print("The given number is palindrome");
		}
		else{
			System.out.print("The given number is not palindrome");
		}
		
	}
}