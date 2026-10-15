import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Latihan04 {
    static String rupiah(long n) {
        return String.format(Locale.GERMANY, "%,d", n); // pemisah titik
    }

    public static void main(String[] args) {
        final int HARGA = 6300;
        Scanner in = new Scanner(System.in);

        System.out.println("======================================================");
        System.out.println("                  TOKO SERBAGUNA IBIK");
        System.out.println("======================================================");
        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = in.nextInt();

        // Diskon 5% untuk setiap kelipatan 3 (maksimal 100%)
        int diskonPersen = Math.min((qty / 3) * 5, 100);
        long total = (long) qty * HARGA;
        long subTotal = total - (total * diskonPersen / 100);

        String waktu = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)", new Locale("id", "ID")));

        System.out.println(waktu);
        System.out.printf("%-6s %-14s %-6s %-14s %-12s%n", "", "ITEM", "QTY", "HARGA", "TOTAL");
        System.out.println("======================================================");
        System.out.printf("%-6d %-14s %-6d Rp %-11s Rp %s%n", 19, "ROTI ENAK", qty,
                rupiah(HARGA) + ",-", rupiah(total));
        System.out.println("------------------------------------------------------");
        System.out.println("Diskon    : " + diskonPersen + "%");
        System.out.println("Sub Total : Rp " + rupiah(subTotal) + ",-");
    }
}
