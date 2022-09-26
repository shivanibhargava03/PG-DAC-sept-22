import java.util.Scanner;

class odd_series{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter range");
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++){
	    if(i%2==1){
		   System.out.print(i+" ");
		}
	}
	
	
	}
}