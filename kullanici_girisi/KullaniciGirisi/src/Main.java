import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String username, password, checkYesNo, newPassword;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kullanýcý Adýnýz: ");
		username = sc.nextLine();
		System.out.print("Þifreniz: ");
		password = sc.nextLine();
		
		if (username.equals("patika") && password.equals("java123"))
			System.out.println("Giriþ Yaptýnýz!");
		else
			System.out.println("Bilgileriniz Yanlýþ!");
			System.out.println("Þifrenizi sýfýrlamak istiyor musunuz? e/h");
			
			checkYesNo = sc.nextLine();
			switch (checkYesNo) 
			{
				case "e":
					System.out.println("Yeni þifrenizi giriniz: ");
					newPassword = sc.nextLine();
					while(newPassword.equals(password))
					{
						System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
						newPassword = sc.nextLine();
						
							
					}
					if(newPassword != password)
					{
						System.out.println("Þifre oluþturuldu.");
						break;
					}
					break;
				case "h":
					break;
						
			}
			
		
	}

}
