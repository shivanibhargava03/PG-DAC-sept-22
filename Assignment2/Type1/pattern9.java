class pattern9{
	public static void main(String[] args){
	    for(int i=5;i>=1;i--){
			char ch='A';
			for(int j=1;j<=(i-1);j++){
				System.out.print(" ");
			}
			
			
			for(int j=i;j<=5;j++){
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}  
	}
}