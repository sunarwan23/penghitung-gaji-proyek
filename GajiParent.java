package perhitungan_gaji;

import java.util.Scanner;

public abstract class GajiParent{
	int tlk;
	int gajipokok;
	int lembur;
	int lemburkusus;
	int gaji;
	int jamlemburkusus;
	int harikerja;
	int tanggalmerah;
	int jamlembur;
	int totalgajipokok;
	int totalgaji;
	public void jamlemburkusus () {
		jamlemburkusus= tanggalmerah*8;
	}
	public void lembur() {
		 lembur = (int) ((gajipokok/7)*1.5)*jamlembur;
	}
	public void lemburkusus () {
		lemburkusus = (int) ((gajipokok/7)*2)*jamlemburkusus;
	}
	public void gajipokok() {
		totalgajipokok = gajipokok*(harikerja-tanggalmerah);
	}
	public void totalgaji () {
		totalgaji = totalgajipokok+lembur+lemburkusus;
	}
	public void input () {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan hari kerja minggu ini :");
		harikerja = input.nextInt();
	System.out.print("Masukan jumlah tanggal merah minggu ini :");
		tanggalmerah = input.nextInt();
	System.out.print("Masukan jumlah jam lembur anda : ");
	jamlembur = input.nextInt();	
	}
}
