import java.util.Scanner;
public class SumofN_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter a numbe ");
		int a = input.nextInt();
        int sum=0;
		for(int i=1;i<=a;i++) {
			sum+=i;
			
		}
		System.out.println(sum);
			
	}

}
