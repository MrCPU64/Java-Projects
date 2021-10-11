import java.util.*;

public class ortalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik notunu giriniz: ");
        int mat = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Fizik notunu giriniz: ");
        int fiz = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kimya notunu giriniz: ");
        int kim = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Türkçe notunu giriniz: ");
        int tur = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Tarih notunu giriniz: ");
        int tar = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Müzik notunu giriniz: ");
        int muz = scanner.nextInt();
        scanner.nextLine();

        scanner.close();

        double ort = (mat + fiz + kim + tur + tar + muz) / 6;

        /*
         * if(ort > 60) { System.out.println("Sınıfı Geçti"); }else
         * System.out.println("Sınıfta Kaldı");
         */

        String gecis = ort > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gecis);
    }

}