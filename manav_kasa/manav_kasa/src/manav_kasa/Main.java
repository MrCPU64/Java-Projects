package manav_kasa;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		double armut_fiyat = 2.14;
		double elma_fiyat = 3.67;
		double domates_fiyat = 1.11;
		double muz_fiyat = 0.95;
		double patlican_fiyat = 5.00;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Armut kaç kilo ? : ");
		double armut_kilo = inp.nextDouble();
		
		System.out.print("Elma kaç kilo ? : ");
		double elma_kilo = inp.nextDouble();
		
		System.out.print("Domates kaç kilo ? : ");
		double domates_kilo = inp.nextDouble();
		
		System.out.print("Muz kaç kilo ? : ");
		double muz_kilo = inp.nextDouble();
		
		System.out.print("Patlýcan kaç kilo ? : ");
		double patlican_kilo = inp.nextDouble();
		
		
		
		double toplamTutar = armut_fiyat*armut_kilo + elma_fiyat*elma_kilo + domates_fiyat*domates_kilo + muz_fiyat*muz_kilo + patlican_fiyat*patlican_kilo;
		System.out.println("Toplam Tutar : " + toplamTutar);
	}

}
