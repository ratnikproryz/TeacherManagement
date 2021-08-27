import java.util.ArrayList;

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
		boMon.xuatBoMon();
	}
	public void cau_6() {
		GiangVien gVien= boMon.getDsGiangVien().get(0); //lay giang vien dau tien trong danh sach cac giang vien cua doi tuong boMOn
		gVien.themMonHoc(); // goi toi ham them mon hoc
		cau_4_Xuat(); // hien thi lai tat ca thong tin
	}
	public void cau_7() {
		ArrayList<GiangVien> dsGV= boMon.getDsGiangVien(); //lay danh sach giang vien
		int size= dsGV.size();
		int check=0;
		for (int i = 0; i < size; i++) {
//			neu giang vien thu i laf giang vien Co Huu va co tuoi lon hon 50 thi in thong tin cua giang vien do
			if((dsGV.get(i) instanceof CoHuu) && (2021 -dsGV.get(i).getNamSinh()) > 50) {
				System.out.println(dsGV.get(i).toString());
				check=1;
			}
		}
//		neu check=0thi ko co giang vien thoa man yeu cau
		if(check ==0 ) {
			System.out.println("Khong co giang vien nao vua la giang vien co huu vua lon hon 50 tuoi");
		}
	}
	
//	public void cau_8(GiangVien gv_1, GiangVien gv_2) {
//		if(gv_1.equals(gv_2)) {
//			if( gv_1.get)
//		}
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		if(obj instanceof this) {
//			return true;
//		}
//		return false;	
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main_QuanLyGiangVien QLGV= new Main_QuanLyGiangVien();
		QLGV.cau_4_Nhap();
		QLGV.cau_4_Xuat();
		QLGV.cau_6();
	}

}
