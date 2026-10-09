package selection;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("memasukan warna");
        String Warna = input.nextLine();

        switch (Warna) {
            case "red":
                System.out.println("warna yang anda pilih merah");
                break;

            case "blue":
                System.out.println("warna yang anda pilih biru");
                break;

            default:
                System.out.println("warna anda bukan biru dan merah");
                break;
        }
    }
}
