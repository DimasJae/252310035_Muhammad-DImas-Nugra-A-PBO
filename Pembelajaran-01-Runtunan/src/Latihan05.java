import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan teks : ");
        String teks = in.nextLine();
        System.out.println("Huruf BESAR   : " + teks.toUpperCase());
    }
}
