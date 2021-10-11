import java.util.*;

public class ucgen_alan {
    public static void main(String[] args) {
        double kenar1, kenar2, kenar3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Kenarı giriniz: ");
        kenar1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("2. Kenarı giriniz: ");
        kenar2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("3. Kenarı giriniz: ");
        kenar3 = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();

        double ucgenCevre = kenar1 + kenar2 + kenar3;
        double u = (ucgenCevre / 2);
        double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.println("Alan : " + alan);

    }

}