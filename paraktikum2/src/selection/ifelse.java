package selection;

import java.util.Scanner;

public class ifelse {
 public static void main(String[] args) {
	int umur;
	Scanner input=new Scanner(System.in);
	
	System.out.println("Msukan Umur Anda");
	umur=input.nextInt();
	
	if(umur>17) {
		System.out.println("Umur Anda Lebih Dari 17");
	}else if(umur<17){
		System.out.println("Umur Anda Kurang Dari 17");
	}
	else {
		System.out.println("umur anda 17 tahun");
	}
}
}
