package week1.day1;

public class DivisibilityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 15;
		if (number%3==0)
			System.out.println("TRIZZ");
		else if (number%5==0)
		System.out.println("Frizz");
		else if(number%3==0 && number%5==0)
			System.out.println("TRIZZFRIZZ");
		}

}
