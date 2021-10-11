import java.util.*;

public class kdv_hesap {
    public static void main(String[] args) {
        double fiyat, kdvFiyat, kdvTutarı, kdvOran1 = 0.18, kdvOran2 = 0.08;
        Scanner scanner = new Scanner(System.in);
        System.out.println("KDV' siz fiyatı giriniz: ");
        fiyat = scanner.nextDouble();
        scanner.close();

        if (fiyat < 1000) {
            kdvTutarı = fiyat * kdvOran1;
            kdvFiyat = fiyat + kdvTutarı;
            System.out.println("KDV tutarı: " + kdvTutarı);
            System.out.println("KDV' li fiyat: " + kdvFiyat);
        } else if (fiyat > 1000) {
            kdvTutarı = fiyat * kdvOran2;
            kdvFiyat = fiyat + kdvTutarı;
            System.out.println("KDV tutarı: " + kdvTutarı);
            System.out.println("KDV' li fiyat: " + kdvFiyat);
        }

    }
}
