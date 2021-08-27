import java.util.Scanner;

public class MonHoc {
	private String tenMonHoc;
	private int tinChi;
	
//	constructor mac dinh
	public MonHoc() {
		// TODO Auto-generated constructor stub
	}
//	constructor co tham so

	public MonHoc(String tenMonHoc, int tinChi) {
		this.tenMonHoc = tenMonHoc;
		this.tinChi = tinChi;
	}
// constructor sao chep
	
	public MonHoc(MonHoc mHoc) {
		this.tenMonHoc= mHoc.tenMonHoc;
		this.tinChi= mHoc.tinChi;
	}
	
//	method nhap thong tin mon hoc
	public void nhapMonHoc() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ten mon hoc: ");
			tenMonHoc= scanner.nextLine();
			System.out.println("So tin chi");
			tinChi= Integer.parseInt(scanner.nextLine());		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Nhap sai du lieu!");
		}
	}

	
//	getter, setter cho cac thuoc tinh
	public String getTenMonHoc() {
		return tenMonHoc;
	}

	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}

	public int getTinChi() {
		return tinChi;
	}

	public void setTinChi(int tinChi) {
		this.tinChi = tinChi;
	}
	
	
}
