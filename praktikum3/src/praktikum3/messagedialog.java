package praktikum3;

import javax.swing.JOptionPane;

public class messagedialog {
	public static void main(String[] args) {
		JOptionPane jop= new JOptionPane();
		
//		jop.showMessageDialog(null, "hello","pesan penting",jop.WARNING_MESSAGE);
//		
//		String nama=jop.showInputDialog(null,"masukan nama anda");
//		jop.showMessageDialog(null, nama);
		
		int confrim=jop.showConfirmDialog(null, "apakah ini kelas pbo","konfirmasi",jop.YES_NO_CANCEL_OPTION);
		
		if(confrim==1) {
			jop.showMessageDialog(null, "anda pilih no");
		}else 
			jop.showMessageDialog(null, "anda pilih yes");
	}
}
