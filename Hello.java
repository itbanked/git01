
public class Hello{
	public static void main(String[] args){

		for(int i=0; i<10; i++)
		System.out.println("Hello Git!!");

		Calculator c = new Calculator();

		System.out.println("3 + 4 = " + Calculator.add(3,4));
		System.out.println("3 - 4 = " + Calculator.substract(3,4));
		System.out.println("3 * 4 = " + Calculator.multiply(3,4));
		System.out.println("3 / 4 = " + Calculator.divide(3,4));	

	}
}