package daire_alan;
import java.util.Scanner;
public class daire_alan {

	public static void main(String[] args) {
		
		double pi = 3.14;
		Scanner inp = new Scanner(System.in);
		System.out.println("Dairenin yar��ap�n� giriniz: ");
		double r = inp.nextInt();
		System.out.println("Dairenin merkez a�� �l��s�n� giriniz: ");
		double alpha = inp.nextInt();
		
		double alan = (pi*r*r*alpha)/360;
		System.out.println("Dairenin alan�: " + alan);
		

	}

}
