import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1, n2, islem;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�lk say�y� giriniz: ");
		n1 = sc.nextInt();
		System.out.println("�kinci say�y� giriniz: ");
		n2 = sc.nextInt();
		
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme\n");
		System.out.print("Se�iminiz: ");
		islem = sc.nextInt();
		switch (islem) 
		{
			case 1: 
				double toplamaSonuc = n1 + n2;
				System.out.println("Sonuc: " + toplamaSonuc);
				break;
			case 2:
				double cikarmaSonuc = Math.abs(n1 - n2);
				System.out.println("Sonuc: " + cikarmaSonuc);
				break;
			case 3:
				double carpmaSonuc = n1 * n2;
				System.out.println("Sonuc: " + carpmaSonuc);
				break;
			case 4:
				double bolmeSonuc = (double)n1 / n2;
				System.out.println("Sonuc: " + bolmeSonuc);
				break;
			
		}
		
		
		
			
		}

}
