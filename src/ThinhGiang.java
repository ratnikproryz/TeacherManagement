import java.util.ArrayList;
import java.util.Scanner;

public class ThinhGiang extends GiangVien{
	private String noiCT; //noi cong tac

//	construct default
	public ThinhGiang() {
		super();
		// TODO Auto-generated constructor stub
	}

//	Constructor sao chep, goi toi construct sao chep lop cha
	public ThinhGiang(GiangVien gVien) {
		super(gVien);
		// TODO Auto-generated constructor stub
	}
	
//	con structor co chua tham so
	public ThinhGiang(String maGV, String tenGV, int namSinh, String trinhDo, int namCT, ArrayList<MonHoc> dsMonHoc,String noiCT) {
		super(maGV, tenGV, namSinh, trinhDo,namCT, dsMonHoc);
		this.noiCT = noiCT;
		// TODO Auto-generated constructor stub
	}
	
	public ThinhGiang(String noiCT) {
		super();
		this.noiCT = noiCT;
	}
//	constructor sao chep
	public ThinhGiang(ThinhGiang thinhGiang) {
		this.noiCT = thinhGiang.noiCT;
	}
	
	
//	method nhap du lieu cho giang vien thinh giang
	public void nhapThinhGiang() {
		super.nhapGiangVien(); //ke thua tu lop cha
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Noi cong tac:");
			noiCT= scanner.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Nhap sai du lieu!");
		}
	}
	
//	xem thong tin giang vien thinh giang
	public void xuatGVThinhGiang() {
		String output= super.xuatGiangVien();
		output += " -  Noi cong tac: "+ noiCT;
		System.out.println(output);
		super.xemMonHoc(); // hien thi cac mon hoc cua giang vien
	}
}
