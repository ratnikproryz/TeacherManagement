import java.util.ArrayList;
import java.util.Scanner;

public class BoMon {
	private  String tenBoMon;
	private ArrayList<GiangVien> dsGiangVien;

//	constructor mac dinh
	public BoMon() {
		dsGiangVien =  new ArrayList<GiangVien>();
		// TODO Auto-generated constructor stub
	}
// 	constructor co tham so
	public BoMon(String tenBoMon, ArrayList<GiangVien> dsGiangVien) {
		this.tenBoMon = tenBoMon;
		this.dsGiangVien = dsGiangVien;
	}
//	constructor sao chep
	public BoMon(BoMon boMon) {
		this.tenBoMon = boMon.tenBoMon;
		this.dsGiangVien = boMon.dsGiangVien;
	}
	
//	method nhap thong tin cho bo mon
	public void nhapBoMon() {
		try {
			Scanner scanner= new Scanner(System.in);
			System.out.println("Ten bo mon:");
			tenBoMon= scanner.nextLine(); 
			System.out.println("So luong giang vien");
			int soGiangvien= Integer.parseInt(scanner.nextLine());
			
			for (int i = 0; i < soGiangvien; i++) {
				GiangVien giangVien;
				System.out.println("Nhap loai giang vien, cohuu / thinhgiang)");
				String loaiGV= scanner.next();
				if(loaiGV.equals("cohuu")) { // neu la giang vien co huu thi tao giang vien co huu
					giangVien = new CoHuu(); // nhap thong tin cho gian vien co huu
					((CoHuu) giangVien).nhapCoHuu();
				}else {
					giangVien = new ThinhGiang();
					((ThinhGiang) giangVien).nhapThinhGiang();
				}
				dsGiangVien.add(giangVien); //them giang vien vao danh sach			
				System.out.println("da them");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Nhap sai du lieu!");
		}
		
	}
	
//	xem thong tin bo mon
	public void xuatBoMon() {
		System.out.println("Ten bo mon: "+ tenBoMon);
		int size= dsGiangVien.size();
		for(int i = 0; i < size; i++) {
			GiangVien gVien = dsGiangVien.get(i);
			if(gVien instanceof CoHuu) { // neu giang vien thu i la giang vien co huu thi goi ham xuatGVCoHuu 
				((CoHuu) gVien).xuatGVCoHuu();
			}else { // nguoc lai, goi toi ham xuat giang vien thinh giang
				((ThinhGiang) gVien).xuatGVThinhGiang();
			}
		}
	}
	
//	getter setter
	public String getTenBoMon() {
		return tenBoMon;
	}
	public void setTenBoMon(String tenBoMon) {
		this.tenBoMon = tenBoMon;
	}
	public ArrayList<GiangVien> getDsGiangVien() {
		return dsGiangVien;
	}
	public void setDsGiangVien(ArrayList<GiangVien> dsGiangVien) {
		this.dsGiangVien = dsGiangVien;
	}
	
	
}
