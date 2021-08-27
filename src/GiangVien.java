import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class GiangVien {
	private String maGV;
	private String tenGV;
	private int namSinh;
	private String trinhDo;
	private int namCT; //nam cong tac
	private ArrayList<MonHoc> dsMonHoc;

	public GiangVien() {
		// TODO Auto-generated constructor stub
	}
	public GiangVien(String maGV, String tenGV, int namSinh, String trinhDo, int namCT, ArrayList<MonHoc> dsMonHoc) {
		this.maGV = maGV;
		this.tenGV = tenGV;
		this.namSinh = namSinh;
		this.trinhDo = trinhDo;
		this.dsMonHoc = dsMonHoc;
		this.namCT= namCT;
	}
	public GiangVien(GiangVien gVien) {
		this.maGV =  gVien.maGV;
		this.tenGV = gVien.tenGV;
		this.namSinh = gVien.namSinh;
		this.trinhDo = gVien.trinhDo;
		this.dsMonHoc = gVien.dsMonHoc;
		this.namCT= gVien.namCT;
	}
	
//	method nhap thong tin cho giang vien
	public void nhapGiangVien() {
		try {
			Scanner scanner= new Scanner(System.in);

			System.out.println("Ma giang vien: ");
			maGV= scanner.nextLine();
			System.out.println("Ten giang vien: ");
			tenGV= scanner.nextLine();
			System.out.println("Nam sinh");
			namSinh= Integer.parseInt(scanner.nextLine()); // chong troi lenh trong java
			System.out.println("Trinh do");
			trinhDo= scanner.nextLine();
			System.out.println("So luong mon hoc");
			
			dsMonHoc = new ArrayList<MonHoc>(); 
			int soMonHoc= Integer.parseInt(scanner.nextLine());
			for (int i = 0; i < soMonHoc; i++) {
				MonHoc monHoc = new MonHoc();
				monHoc.nhapMonHoc(); //nhap thong tin mon hoc cua giang vien
				dsMonHoc.add(monHoc); //them vao danh sach mon hoc
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Xay ra loi do du lieu nhap vao sai!");
		}
	}
	
	public void xemMonHoc() {
		int size= dsMonHoc.size(); // lay kich thuoc cua danh sach
		System.out.println("Danh sach mon hoc:");
		for (int i = 0; i < size; i++) {
			System.out.println("Ten mon hoc: "+ dsMonHoc.get(i).getTenMonHoc()+ " - So tin chi: "+ dsMonHoc.get(i).getTinChi());
		}
	}
	
//	method them mon hoc
	public void themMonHoc() {
		MonHoc monHoc = new MonHoc();	//tao mot doi tuong thuoc class mon  hoc
		monHoc.nhapMonHoc(); // nhap thong tin mon hoc
		dsMonHoc.add(monHoc); // them vao danh sach
	}
	public String xuatGiangVien() {//tra ve nhung thong tin cho cac lop con
		String output="Ma GV: "+ maGV+" - Ten GV: "+tenGV+" - Nam sinh: "+ namSinh+" - Trinh do: "+ trinhDo;
		return output;
	}
	
	
//	getter, setter
	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public String getTenGV() {
		return tenGV;
	}
	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getTrinhDo() {
		return trinhDo;
	}
	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}
	public int getNamCT() {
		return namCT;
	}
	public void setNamCT(int namCT) {
		this.namCT = namCT;
	}
	public ArrayList<MonHoc> getDsMonHoc() {
		return dsMonHoc;
	}
	public void setDsMonHoc(ArrayList<MonHoc> dsMonHoc) {
		this.dsMonHoc = dsMonHoc;
	}
	
	
}
 