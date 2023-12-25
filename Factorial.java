import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter a numbe ");
		int a = input.nextInt();
		int fact=1;
		for(int i=a;i>=1;i--) {
		fact*=i;
			
			System.out.println(i);
		}
		System.out.println(fact);
	}

}
