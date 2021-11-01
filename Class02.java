class is_prime{
	int n;
	static int flag=0;
	static void is_prime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag++;
			}
		}
		if(flag==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
public class Class02 {

	public static void main(String[] args) {
		is_prime.is_prime(37);
		is_prime.is_prime(23);
		is_prime.is_prime(39);
	}

}
