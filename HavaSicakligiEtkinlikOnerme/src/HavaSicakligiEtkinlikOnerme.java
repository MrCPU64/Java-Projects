import java.util.Scanner;
public class HavaSicakligiEtkinlikOnerme {

	public static void main(String[] args) {
		int heat;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Sicaklik Giriniz: ");
		heat = input.nextInt();
		
		if(heat>25) {
			System.out.println("Yuzebilirsiniz.");
		}else if(heat>=15 && heat<=25) {
			System.out.println("Piknik yapabilirsiniz.");
		}else if(heat>=5 && heat<15){
			System.out.println("Sinemaya gidebilirsiniz.");
		}else if(heat<5) {
			System.out.println("Kayak yapabilirsiniz.");
		}
	}

}
