package perhitungan_gaji;

import java.util.Scanner;

public class GajiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TukangUmum umum = new TukangUmum();
	Helper helper = new Helper();
	Tukangkusus tukangkusus = new Tukangkusus();
	Serabutan serabutan = new Serabutan();

		System.out.println("================================");
		System.out.println("NAMA     : SUNARWAN");
		System.out.println("NIM      : 18111099");
		System.out.println("================================\n\n");
		
		System.out.println("PERHITUNGAN GAJI MINGGUAN PROYEK HOTEL MELATI");
		System.out.println("1. TUKANG");
		System.out.println("2. TENAGA AHLI KUSUS");
		System.out.println("3. HELPER");
		System.out.println("4. SERABUTAN");
		System.out.print("Masukan status pekerja anda : ");
		Scanner status = new Scanner(System.in);
		int pekerja = status.nextInt();
	switch (pekerja) {
	case 1:
		umum.tukangumum();
		break;
	case 2:
		tukangkusus.tukangkusus();
		break;
	case 3:
		helper.helper();
		break;
	case 4:
		serabutan.serabutan();
		break;
	default:
		System.out.println("pilihan : "+pekerja+" tidak ada");
		break;
	}
	}

}
