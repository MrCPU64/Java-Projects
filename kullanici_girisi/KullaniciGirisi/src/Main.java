import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String username, password, checkYesNo, newPassword;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kullan�c� Ad�n�z: ");
		username = sc.nextLine();
		System.out.print("�ifreniz: ");
		password = sc.nextLine();
		
		if (username.equals("patika") && password.equals("java123"))
			System.out.println("Giri� Yapt�n�z!");
		else
			System.out.println("Bilgileriniz Yanl��!");
			System.out.println("�ifrenizi s�f�rlamak istiyor musunuz? e/h");
			
			checkYesNo = sc.nextLine();
			switch (checkYesNo) 
			{
				case "e":
					System.out.println("Yeni �ifrenizi giriniz: ");
					newPassword = sc.nextLine();
					while(newPassword.equals(password))
					{
						System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
						newPassword = sc.nextLine();
						
							
					}
					if(newPassword != password)
					{
						System.out.println("�ifre olu�turuldu.");
						break;
					}
					break;
				case "h":
					break;
						
			}
			
		
	}

}
