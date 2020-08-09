package t3h.javacore.oop.buoi4.bai4;

public class Laptop extends SanPham {
	
	String chipXuLy;
	public String chipDoHoa;
	public String ram;
	
	public Laptop(String hangSanXuat, String tenSanPham, int giaBan, String chipXuLy, String chipDoHoa, String ram) {
		super();
		this.hangSanXuat = hangSanXuat;
		this.tenSanPham = tenSanPham;
		this.giaBan = giaBan;
		this.chipXuLy = chipXuLy;
		this.chipDoHoa = chipDoHoa;
		this.ram = ram;
	}
	
	public Laptop() {};
	
	public void hienThongTin() {
		hienThongTinSanPham();
		System.out.println("Chip xu ly: " + this.chipXuLy);
		System.out.println("Chip do hoa: " + this.chipDoHoa);
		System.out.println("Ram: " + this.ram);
	};
}
