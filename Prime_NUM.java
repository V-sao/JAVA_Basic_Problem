import java.util.Scanner;

public class Prime_NUM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int a= input.nextInt();
		int temp=0;
		 for(int i=2;i<a;i++){
			if(a%i==0) {
				 temp=temp+1;
			}
			
		
		}
		 if(temp==0) {
				System.out.println(a+" is a prime number");
			
		 }
		 else {
			 System.out.println("it is not a prime number");
		 }
		
		}

	}



