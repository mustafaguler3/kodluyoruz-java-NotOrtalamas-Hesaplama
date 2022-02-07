import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int mat,fizik,kimya,turkce,tarih,muzik;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Matematik notunuz ");
		mat = scanner.nextInt();
		
		System.out.println("Fizik notunuz ");
		fizik = scanner.nextInt();
		
		System.out.println("Kimya notunuz ");
		kimya = scanner.nextInt();
		
		System.out.println("Turkçe notunuz ");
		turkce = scanner.nextInt();
		
		System.out.println("Tarih notunuz ");
		tarih = scanner.nextInt();
		
		System.out.println("Muzik notunuz ");
		muzik = scanner.nextInt();

		int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
		double ortalama = toplam / 6;
		
		System.out.println(ortalama > 60 ? "Sýnýfý geçtin :":"Sýnýfta kaldýn :");

	}

}
