package t3h.javacore.oop.buoi5.bai2.object;

import java.util.List;

public class ChuyenBay {
	
	private String ten;
	private int thoiGian;
	private List<KhachHang> danhSachKhachHang;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(int thoiGian) {
		this.thoiGian = thoiGian;
	}
	public List<KhachHang> getDanhSachKhachHang() {
		return danhSachKhachHang;
	}
	public void setDanhSachKhachHang(List<KhachHang> danhSachKhachHang) {
		this.danhSachKhachHang = danhSachKhachHang;
	}
	
	public ChuyenBay(String ten, int thoiGian, List<KhachHang> danhSachKhachHang) {
		super();
		this.ten = ten;
		this.thoiGian = thoiGian;
		this.danhSachKhachHang = danhSachKhachHang;
	}



	private int tongTien = 0;
	
	public void inTongTien() {
		System.out.println("Tong tien thu duoc: " + tongTien);
	}
	
	
	public void inThongTinKhachHang() {
		for (int i = 0; i < this.danhSachKhachHang.size(); i++) {
			KhachHang khach = this.danhSachKhachHang.get(i);
			System.out.println("Ten khach: " + khach.ten);
			System.out.println("Gioi tinh: " + khach.gioiTinh);
			System.out.println("Tuoi: " + khach.tuoi);
			System.out.println("Ten chuyen bay: " + this.ten);
			System.out.println("Thoi gian bay: " + this.thoiGian);
			System.out.println("So luong ve: " + khach.soLuongVe);
			int tienKhachTra = tinhTien(khach, this);
			System.out.println("Tien khach phai tra: " + tienKhachTra);
			tongTien += tienKhachTra;
			System.out.println("=============================");
		}
	}
	
	private int tinhTien(KhachHang khach, ChuyenBay chuyenBay) {
		int result = khach.ve.getGia() * khach.soLuongVe;
		if (khach.tuoi < 6 && 
				khach.ve.getLoaiVe().equals(LoaiVe.TRUNG_CAP)) {
			result = result - (result * 20 / 100);
		}
		
		if (chuyenBay.thoiGian > 20 || chuyenBay.thoiGian < 4) {
			result = result - (result * 50 / 100);
		}
		return result;
	}
}
