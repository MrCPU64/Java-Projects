package vucut_kitle_indeksi_hesaplama;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("L�tfen boyunuzu (metre cinsinde) giriniz : ");
		double boy = inp.nextDouble();
		
		System.out.println("L�tfen kilonuzu giriniz : ");
		double kilo = inp.nextDouble();
		
		double vucutKitleIndeksi = kilo / boy * boy;
		System.out.println("V�cut Kitle �ndeksiniz : " + vucutKitleIndeksi);
		
	}

}
