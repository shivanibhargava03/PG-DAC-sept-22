import java.util.Scanner;

class armstrong{
   public static void main(String[] args){
   
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter number");
	  int num=sc.nextInt();
	  
	  int temp=num;
	  int rem;
	  int arm=0;
	  int count=0;
	 
	  
	  while(num>0){
		   rem=num%10;
		   
		   num=num/10;
		   count++;
		
		}
		num=temp;
		
	   while(num>0)
		 
	   {
		   rem=num%10;
		   num=num/10;
		   int n=1;
		   for(int j=1;j<=count;j++){
			   n=n*rem;
		   }
		   
		   arm=arm+n;   
	   }
	   
		if(temp==arm){
	      System.out.println("entered number is armstrong number");
	   }
	   else{
		  System.out.println("entered number is not a armstrong number"); 
	   }
	  
   }
}