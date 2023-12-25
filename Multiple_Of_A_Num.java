import java.util.Scanner;

public class Multiple_Of_A_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int a = input.nextInt();
		
		for(int i=1;i<=100;i++) {
			if (i%a==0) {
				System.out.println(i+"is multiple of "+a);
			}
		}
			
	}

}
