package Quiz2;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args){
		int initialCost = 12342;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your second year cost?");
		int secondCost = input.nextInt();
		System.out.println("What is your third year cost?");
		int thirdCost = input.nextInt();
		System.out.println("What is your forth reat cost?");
		int forthCost = input.nextInt();
		
		int[] total = {secondCost, thirdCost, forthCost};
		int sum = 0;
		for (int i : total)
			sum+=i;
		int sum1 = sum + initialCost;

		System.out.println("The total cost of four years college is "+ sum1 + ".");
	}
}
