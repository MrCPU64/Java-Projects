import java.util.*;

public class taksimetre_programı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Girilecek mesafeyi giriniz: ");
        double taksimetreKM = scanner.nextInt();
        scanner.close();
        double taksimetreAcilisUcreti = 10.0;
        double taksimetreUcret = taksimetreKM * 2.20;

        if (taksimetreUcret <= 10) {
            taksimetreUcret = 20;
            System.out.println("Ödeyeceğiniz Ücret: " + taksimetreUcret);
        } else {
            double sonUcret = taksimetreAcilisUcreti + taksimetreUcret;
            System.out.println("Ödeyeceğiniz Ücret: " + sonUcret);
        }

    }
}