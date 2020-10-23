package perhitungan_gaji;


public class TukangUmum extends GajiParent {

		
	public void tukangumum () {
		input();
		 gajipokok = 150000;
		 jamlemburkusus ();
		 lembur();
		 lemburkusus ();
		gajipokok();
		totalgaji();
		System.out.println("\nGaji anda adalah : "+totalgaji+" Rupiah.");
	}
}
