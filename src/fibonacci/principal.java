package fibonacci;

import java.util.Scanner;

public class principal{
	
	public static void main(String[] args) {
		
		System.out.println("Fins quin numero vols que es mostri la seria fibonacci");	
		 int number = new Scanner(System.in).nextInt();
		 
		 for(int i=1; i<=number; i++){
	            System.out.print(fibonacci(i) +" ");
	        }
		 
	}
	
	  public static int fibonacci(int number){
	        if(number == 1 || number == 2){
	            return 1;
	        }
	 
	        return fibonacci(number-1) + fibonacci(number -2); 
	    }
	
	
}