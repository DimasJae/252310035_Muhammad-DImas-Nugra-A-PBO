package repetition;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Masukan Jumlah Pengulangan");
		int number=input.nextInt();
		
//		for(int i=0;i<number;i++) {
//			System.out.println("Hello Word ");
//		}
		
//		int a=0;
//		while(a<number) {
//		System.out.println("hello Word");
//		a++;
//		}
		
		int b=0;
		do {
			System.out.println("Hello Word");
			b++;	
		}while(b<number);
	}

}
