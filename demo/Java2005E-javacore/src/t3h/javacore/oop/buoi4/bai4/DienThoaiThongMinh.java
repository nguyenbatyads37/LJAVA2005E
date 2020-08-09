package t3h.javacore.oop.buoi4.bai4;

public class DienThoaiThongMinh extends SanPham {

	public String manHinh;
	public String heDieuHanh;
	public String camera;
	
	public DienThoaiThongMinh(String hangSanXuat, String tenSanPham, int giaBan, String manHinh, String heDieuHanh,
			String camera) {
		super();
		this.hangSanXuat = hangSanXuat;
		this.tenSanPham = tenSanPham;
		this.giaBan = giaBan;
		this.manHinh = manHinh;
		this.heDieuHanh = heDieuHanh;
		this.camera = camera;
	}

	public DienThoaiThongMinh() {
		
	}
	
	public void hienThongTin() {
		hienThongTinSanPham();
		System.out.println("Man hinh: " + this.manHinh);
		System.out.println("He dieu hanh: " + this.heDieuHanh);
		System.out.println("Camera: " + this.camera);
	}
	
}
