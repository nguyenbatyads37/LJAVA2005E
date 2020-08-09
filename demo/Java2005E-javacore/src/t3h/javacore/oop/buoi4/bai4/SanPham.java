package t3h.javacore.oop.buoi4.bai4;

public class SanPham {
	public String hangSanXuat;
	public String tenSanPham;
	public int giaBan;
	
	protected void hienThongTinSanPham() {
		System.out.println("San pham: " + this.tenSanPham);
		System.out.println("Hang san xuat: " + this.hangSanXuat);
		System.out.println("Gia ban: " + this.giaBan);
	}
}
