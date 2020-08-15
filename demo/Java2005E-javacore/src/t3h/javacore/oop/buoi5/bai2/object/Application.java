package t3h.javacore.oop.buoi5.bai2.object;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		ChuyenBay chuyenBay = new ChuyenBay("DiMy", 21, new ArrayList<KhachHang>());
		Ve veCaoCap = new Ve(10000, LoaiVe.CAO_CAP);
		Ve veThuongGia = new Ve(5000, LoaiVe.THUONG_GIA);
		Ve veTrungCap = new Ve(2000, LoaiVe.TRUNG_CAP);
		
		// Khach dat ve
		KhachHang theTan = new KhachHang("Tan", "Nam", 20);
		theTan.ve = veCaoCap;
		theTan.soLuongVe = 1;
		chuyenBay.getDanhSachKhachHang().add(theTan);
		
		KhachHang quynh = new KhachHang("Quynh", "Nu", 5);
		quynh.ve = veTrungCap;
		quynh.soLuongVe = 2;
		chuyenBay.getDanhSachKhachHang().add(quynh);
		
		chuyenBay.inThongTinKhachHang();
		chuyenBay.inTongTien();
	}

}
