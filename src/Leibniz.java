public class Leibniz {

	public static void main(String[] args) {
		double denominator = 1, pi = 0, a = -1, num = 1;
		
		while(num < 1000000) {
			a *= -1;
			pi += a*1.0/denominator;
			denominator += 2;
			num++;
		}
		
		System.out.println(4*pi);
	}

}
