
public class Euler {

	public static void main(String[] args) {
		double denominator = 1, pi = 0;
		
		while(denominator < 1000000) {
			pi += 1.0/Math.pow(denominator, 2);
			denominator++;
		}
		pi = Math.sqrt(pi*6);
		System.out.println(pi);

	}

}
