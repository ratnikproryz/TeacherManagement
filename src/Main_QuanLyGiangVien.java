import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.xml.bind.helpers.NotIdentifiableEventImpl;

public class Main_QuanLyGiangVien {
	BoMon boMon = new BoMon();
	public Main_QuanLyGiangVien() {
		// TODO Auto-generated constructor stub
	}

//	nhap thong tin cho cac giang vien
	public void cau_4_Nhap() {
		boMon.nhapBoMon();
	}
	public void cau_4_Xuat() {
		System.out.println("");
		boMon.xuatBoMon();
	}
	public void cau_6() {
		GiangVien gVien= boMon.getDsGiangVien().get(0); //lay giang vien dau tien trong danh sach cac giang vien cua doi tuong boMOn
		gVien.themMonHoc(); // goi toi ham them mon hoc
		cau_4_Xuat(); // hien thi lai tat ca thong tin
	}
	
//	
	public int cau_7(int x) {
		ArrayList<GiangVien> dsGV= boMon.getDsGiangVien(); //lay danh sach giang vien
		int size= dsGV.size();
		int dem=0;;
		for (int i = 0; i < size; i++) {
//			neu giang vien thu i laf giang vien Co Huu va co tuoi lon hon x thi in thong tin cua giang vien do
			if((dsGV.get(i) instanceof CoHuu) && (dsGV.get(i).getTuoi()) > x) {
				System.out.println(dsGV.get(i).xuatGiangVien());
				dem++;
			}
		}
//		neu dem=0 thi ko co giang vien thoa man yeu cau
		if(dem ==0 ) {
			System.out.println("Khong co giang vien nao thoa man yeu cau!");
		}
		return dem;
	}

	
//	dem so giang vien co huu sinh truoc nam 1990, tuc co tuoi lon hon (2021-1990)
	public void cau_9() {
		System.out.println("\nGiang vien sinh truoc nam 1990:");
		int dem= cau_7(2021- 1990);
		System.out.println("So giang vien co huu sinh truoc nam 1990: "+ dem);
	}
	
//	tim giang vien co huu cao tuoi nhat
	public void cau_10() {
		ArrayList<GiangVien> dsGV= boMon.getDsGiangVien(); //lay danh sach giang vien
		int size= dsGV.size();
		int max=0;
//		tim do tuoi cao nhat
		for (int i = 0; i < size; i++) {
			if((dsGV.get(i) instanceof CoHuu) && (dsGV.get(i).getTuoi()) > max) {
				max= dsGV.get(i).getTuoi();
			}
		}
//		in thong tin cua nhung giang vien co huu cao tuoi nhat
		for (int i = 0; i < size; i++) {
			if((dsGV.get(i) instanceof CoHuu) && (dsGV.get(i).getTuoi()) == max) {
				System.out.println(dsGV.get(i).xuatGiangVien());
			}
		}
	}
	
//	tim giang vien co ten nhap tu ban phim
	public void cau_11() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten giang vien can tim");
		String tenGV= scanner.nextLine();
		int check=0;
		
		ArrayList<GiangVien> dsGV= boMon.getDsGiangVien(); //lay danh sach giang vien
		int size= dsGV.size();
		for (int i = 0; i < size; i++) {
			if(dsGV.get(i).getTenGV().equals(tenGV)){ // neu giang vien thu i giong ten nhap vao thi in thong tin  
				System.out.println(dsGV.get(i).xuatGiangVien());
				check=1;
			}
		}
		if(check==0) {
			System.out.println("khong co giang vien co ten la "+ tenGV+" trong danh sach!");
		}
	}
	
//	tim giang vien thinh giang co nam sinh x
	public void cau_12() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Nhap nam sinh: ");
		int year= Integer.parseInt(scanner.nextLine());
		int check=0;
		
		ArrayList<GiangVien> dsGV= boMon.getDsGiangVien(); //lay danh sach giang vien
		int size= dsGV.size();
		for (int i = 0; i < size; i++) {	//duyet qua danh sach giang vien
			if( (dsGV.get(i) instanceof ThinhGiang) && (dsGV.get(i).getNamSinh() == year) ){ // neu la giang vien thing giang va co nam sinh year
				System.out.println(dsGV.get(i).xuatGiangVien());
				check=1;
			}
		}
		
		if(check ==0) {
			System.out.println("Khong co giang vien thing giang co nam sinh la "+ year);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main_QuanLyGiangVien QLGV= new Main_QuanLyGiangVien();
		QLGV.cau_4_Nhap();
		QLGV.cau_4_Xuat();
		
		System.out.println("\nThem mon hoc cho giang vien dau tien:");
		QLGV.cau_6();
		
		System.out.println("\nGiang vien co huu lon hon 50 tuoi: ");
		QLGV.cau_7(50);
		System.out.println("-------------------------------------------------");
		
		QLGV.cau_9();
		System.out.println("\n-------------------------------------------------");
		
		System.out.println("\nGiang vien co huu co huu lon tuoi nhat: ");
		QLGV.cau_10();
		System.out.println("\n-------------------------------------------------");
		
		System.out.println("\nTim giang vien theo ten! ");
		QLGV.cau_11();
		System.out.println("\n-------------------------------------------------");
		
		System.out.println("\nTim giang vien theo nam sinh!");
		QLGV.cau_12();
		System.out.println("-------------KET THUC CHUONG TRINH-------------");
	}

}
