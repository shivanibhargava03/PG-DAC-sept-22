import java.util.Scanner;

class prime{
    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		int temp=num/2;
		int flag=0;
		for(int i=2;i<temp;i++){
		    if(num%i==0){
			    System.out.println("not a prime number");
				flag=1;
				break;
			}
						
		}
		if(flag==0){
			System.out.println("prime number");
		}
		
	}
}