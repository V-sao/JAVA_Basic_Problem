import java.util.Scanner;

public class Num_One_to_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//taking user input
		Scanner input =new Scanner(System.in);
		System.out.println("Enter input");
		int a=input.nextInt();
		
		//printing 1 to N
		for(int i=1;i<=a;i++) {
			System.out.println(i);
		}
		
		
	}

}
