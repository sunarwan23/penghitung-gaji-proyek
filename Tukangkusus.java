package perhitungan_gaji;
import java.util.*;

public class Tukangkusus extends GajiParent {
	
	public void tukangkusus() {
	input();
	System.out.print("Masukan gaji pokok anda : ");
	Scanner input = new Scanner(System.in);
	gajipokok = input.nextInt();
	 jamlemburkusus ();
	 lembur();
	 lemburkusus ();
	gajipokok();
	totalgaji();
	System.out.println("\nGaji anda adalah : "+totalgaji+" Rupiah.");
	}
}
