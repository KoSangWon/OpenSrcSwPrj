
public class Ramanuzan {

	public static void main(String[] args) {
		double sum = 0;
		double temp;
		for(int i = 0; i < 30; i++) {
			temp = (double)(factorial(4*i)*(1103+(26390*i)))/((Math.pow(factorial(i), 4))*Math.pow(396, (4*i)));
			sum += temp;
		}
		sum *= (Math.sqrt(8)/9801);
		sum = Math.pow(sum, -1);
		System.out.println(sum);
	}

	private static int factorial(int num) {
		int result = 1;
		
		for(int i = 1; i <= num; i++)
			result *= i;
		
		return result;
	}

}
