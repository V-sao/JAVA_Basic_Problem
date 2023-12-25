import java.util.Scanner;

public class Multipication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = input.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a+"x"+i+"="+ a*i);
			
		}
	}

}
