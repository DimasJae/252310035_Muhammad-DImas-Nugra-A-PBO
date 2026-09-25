package praktikum1;

import java.util.Scanner;

public class objek {
	public static void main(String[] args) {
		int Panjang,Lebar,Hasil;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukan Panjang");
		Panjang=scanner.nextInt();
		System.out.println("Masukan Lebar");
		Lebar=scanner.nextInt();
		Hasil=Panjang * Lebar;
		System.out.println("Hasil:"+Hasil);
	}

}
