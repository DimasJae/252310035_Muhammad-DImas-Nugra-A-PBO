import java.util.Scanner;

public class Latihan03 {
    // Class variable
    static final double PI = 3.14159;
    static Scanner in = new Scanner(System.in);

    // ===== Method tanpa nilai balik (void) =====
    static void segitiga() {
        System.out.print("Alas, Tinggi, Sisi miring : ");
        double a = in.nextDouble(), t = in.nextDouble(), s = in.nextDouble();
        double luas = 0.5 * a * t;
        double keliling = a + t + s;
        System.out.println("Luas = " + luas + " | Keliling = " + keliling);
    }

    static void layangLayang() {
        System.out.print("Diagonal 1, Diagonal 2, Sisi pendek, Sisi panjang : ");
        double d1 = in.nextDouble(), d2 = in.nextDouble();
        double s1 = in.nextDouble(), s2 = in.nextDouble();
        System.out.println("Luas = " + (0.5 * d1 * d2) + " | Keliling = " + (2 * (s1 + s2)));
    }

    // ===== Method dengan nilai balik =====
    static double luasPermukaanKerucut(double r, double s) {
        return PI * r * (r + s);
    }
    static double volumeKerucut(double r, double t) {
        return PI * r * r * t / 3;
    }
    static double luasPermukaanTabung(double r, double t) {
        return 2 * PI * r * (r + t);
    }
    static double volumeTabung(double r, double t) {
        return PI * r * r * t;
    }
    static double volumePrismaSegitiga(double alas, double tinggiSegitiga, double tinggiPrisma) {
        return 0.5 * alas * tinggiSegitiga * tinggiPrisma;
    }
    static double luasPermukaanPrismaSegitiga(double alas, double tinggiSegitiga,
                                              double s1, double s2, double s3, double tinggiPrisma) {
        double luasAlas = 0.5 * alas * tinggiSegitiga;
        return 2 * luasAlas + (s1 + s2 + s3) * tinggiPrisma;
    }

    public static void main(String[] args) {
        System.out.println("=== MENU BANGUN ===");
        System.out.println("1. Segitiga            (NPM ganjil)");
        System.out.println("2. Kerucut             (NPM genap)");
        System.out.println("3. Layang-layang       (NPM ganjil)");
        System.out.println("4. Tabung              (NPM genap)");
        System.out.println("5. Prisma Segitiga");
        System.out.print("Pilih : ");
        int pilih = in.nextInt();

        switch (pilih) {
            case 1:
                segitiga();
                break;
            case 2: {
                System.out.print("Jari-jari, Tinggi, Garis pelukis : ");
                double r = in.nextDouble(), t = in.nextDouble(), s = in.nextDouble();
                System.out.println("Luas Permukaan = " + luasPermukaanKerucut(r, s));
                System.out.println("Volume         = " + volumeKerucut(r, t));
                break;
            }
            case 3:
                layangLayang();
                break;
            case 4: {
                System.out.print("Jari-jari, Tinggi : ");
                double r = in.nextDouble(), t = in.nextDouble();
                System.out.println("Luas Permukaan = " + luasPermukaanTabung(r, t));
                System.out.println("Volume         = " + volumeTabung(r, t));
                break;
            }
            case 5: {
                System.out.print("Alas segitiga, Tinggi segitiga, Sisi1, Sisi2, Sisi3, Tinggi prisma : ");
                double a = in.nextDouble(), ts = in.nextDouble();
                double s1 = in.nextDouble(), s2 = in.nextDouble(), s3 = in.nextDouble();
                double tp = in.nextDouble();
                System.out.println("Luas Permukaan = " + luasPermukaanPrismaSegitiga(a, ts, s1, s2, s3, tp));
                System.out.println("Volume         = " + volumePrismaSegitiga(a, ts, tp));
                break;
            }
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
