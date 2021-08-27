import java.util.ArrayList;
import java.util.Scanner;

public class CoHuu extends GiangVien {
	private float hsLuong;
	private int namBatDauCT; // nam bat dau cong tac
	
//	constructor default
	public CoHuu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CoHuu(GiangVien gVien) {
		super(gVien);	//goi toi constructor sao chep cua lop cha(Lop GiangVien)
		// TODO Auto-generated constructor stub
	}
	
//	constructor chua tham so
	public CoHuu(String maGV, String tenGV, int namSinh, String trinhDo, int namCT,ArrayList<MonHoc> dsMonHoc, float hsLuong, int namBatDauCT) {
		super(maGV, tenGV, namSinh, trinhDo,namCT, dsMonHoc);
		this.hsLuong = hsLuong;
		this.namBatDauCT = namBatDauCT;
		// TODO Auto-generated constructor stub
	}
	
	public CoHuu(float hsLuong, int namBatDauCT) {
		super();
		this.hsLuong = hsLuong;
		this.namBatDauCT = namBatDauCT;
	}
//	constructor sao chep
	public CoHuu(CoHuu coHuu) {
		this.hsLuong = coHuu.hsLuong;
		this.namBatDauCT = coHuu.namBatDauCT;
	}
	
//	method nhap thong tin cho giang vien co huu
//	ke thua phuong thuc nhapGiangVien tu lop cha
	public void nhapCoHuu() {
		super.nhapGiangVien(); // goi toi phuong thuc nhap o lop cha de nhap nhung thuoc tinh ma no ke thua
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("He so luong: ");
			hsLuong= Float.parseFloat(scanner.nextLine()); // xu li troi lenh
			System.out.println("Nam bat dau cong tac");
			namBatDauCT= Integer.parseInt(scanner.nextLine());			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Nhap sai du lieu!");
		}
	}
	
//	ham in thong tin giang vien co huu
	public void xuatGVCoHuu() {
		String output= super.xuatGiangVien(); //lay gia tri cua cac thuoc tinh ke thua tu lop cha
		output+=( " - He so luong: "+ hsLuong+" - Nam bat dau cong tac: "+namBatDauCT);
		System.out.println(output);
		super.xemMonHoc(); // hien thi cac mon hoc cua giang vien
	}
}
