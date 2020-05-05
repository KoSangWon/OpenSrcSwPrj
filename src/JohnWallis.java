
public class JohnWallis {

	public static void main(String[] args) {
		double pi = 1.0;
		
		for(int i = 1; i < 100000; i++) {
			double num = 4.0 * i * i;
			pi *= num / (num-1);
		}
		System.out.println(2*pi);
	}

}
