package cek_umur;

import javax.swing.JOptionPane;

public class umur {
 public static void main(String[] args) {
	
	 JOptionPane jop = new JOptionPane();
	 
	 jop.showMessageDialog(null, "Cek umur");
	 
	 String input = jop.showInputDialog(null, "Masukkan umur anda");
	 int umur = Integer.parseInt(input);
	 
	 if(umur>=17) {
		 jop.showMessageDialog(null, "Umur Kamu diatas 17");
	 }else {
		 jop.showMessageDialog(null, "umur Kamu dibawah 17");
	 }
}
}
