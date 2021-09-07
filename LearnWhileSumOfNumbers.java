package week1.day2;

public class LearnWhileSumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number = 2345;
		int Quotient, Remainder, Sum = 0;
		while (Number != 0) {
			Quotient = Number / 10;
			Remainder = Number % 10;
			Sum = Sum + Remainder;
			Number = Quotient;
		}
		System.out.println("Sum is " + Sum);
	}

}
