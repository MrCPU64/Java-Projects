
import java.util.Scanner;

public class SinifGecmeDurumu {

	public static void main(String[] args) {
		int mat, fizik, turkce, kimya, muzik;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunuz : ");
		mat = input.nextInt();
		System.out.print("Fizik notunuz : ");
		fizik = input.nextInt();
		System.out.print("T�rk�e notunuz : ");
		turkce = input.nextInt();
		System.out.print("Kimya notunuz : ");
		kimya = input.nextInt();
		System.out.print("M�zik notunuz : ");
		muzik = input.nextInt();
		input.close();
		
		double average = 0;
		if(input != null) {
			if(mat<0 || mat>100)
				average = (double)(fizik+turkce+kimya+muzik)/4;
			if(fizik<0 || fizik>100)
				average = (double)(mat+turkce+kimya+muzik)/4;
			if(turkce<0 || turkce>100)
				average = (double)(mat+fizik+kimya+muzik)/4;
			if(kimya<0 || kimya>100)
				average = (double)(mat+fizik+turkce+muzik)/4;
			if(muzik<0 || muzik>100)
				average = (double)(mat+fizik+turkce+kimya)/4;
		}
		

		
		
		if(average<=55) {
			System.out.println("S�n�fta kald�n�z, seneye tekrar g�r��mek �zere!");
			System.out.println("Ortalaman�z: " + average);
		}else {
			System.out.println("Tebrikler, s�n�f ge�tiniz!");
			System.out.println("Ortalaman�z: " + average);	
		}
		
		
	}

}
