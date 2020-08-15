package t3h.javacore.oop.buoi5.bai2.object;

public class KhachHang extends ConNguoi {

	public Ve ve;
	public int soLuongVe;
	
	public KhachHang(String ten, String gioiTinh, int tuoi) {
		super(ten, gioiTinh, tuoi);
	}
	
	public KhachHang(String ten, String gioiTinh, int tuoi, Ve ve, int soLuongVe) {
		super(ten, gioiTinh, tuoi);
		this.ve = ve;
		this.soLuongVe = soLuongVe;
	}

	public void mua(Ve ve, int soLuong) {
		this.ve = ve;
		this.soLuongVe = soLuong;
	};
}
