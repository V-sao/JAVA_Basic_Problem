
public class Sum_PrimeNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		int count=0;
		for(int i=2;i<=100;i++) {
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
				count =count+1;
				}
			}
			if(count==0) {
				//System.out.println(i);
				sum+=i;
		}
			else {
				count=0;
			}
		
	}
		System.out.println(sum);

}
}
