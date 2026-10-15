import java.util.Scanner;

public class Latihan09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Students mhs = new Students();

        System.out.print("Nama Lengkap : ");
        mhs.setNamaLengkap(in.nextLine());
        System.out.print("NPM          : ");
        mhs.setNpm(in.nextLine());
        System.out.print("Kelas        : ");
        mhs.setKelas(in.nextLine());
        System.out.print("Semester     : ");
        mhs.setSemester(in.nextInt());
        System.out.print("IPK          : ");
        mhs.setIpk(in.nextDouble());
    }
}
