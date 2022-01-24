import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1, n2, islem;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ýlk sayýyý giriniz: ");
		n1 = sc.nextInt();
		System.out.println("Ýkinci sayýyý giriniz: ");
		n2 = sc.nextInt();
		
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme\n");
		System.out.print("Seçiminiz: ");
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
