import java.util.Scanner;

public class USD2INR {
	public static void main(String[] args) {

		System.out.println("How many $'s you want to exchange: ");
		Scanner sc = new Scanner(System.in);
		double Dollar = sc.nextDouble();

		System.out.println("Tell me the Current exchange rate: ");
		double Rate = sc.nextDouble();

		double iRupee = Dollar * Rate;
		System.out.println("After Conversion: " + iRupee +" Rupees");

	}
}
