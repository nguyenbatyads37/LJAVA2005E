package t3h.javacore.oop.buoi4.bai4;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Chon loai san pham: ");
		System.out.println("1. Dien thoai thong minh");
		System.out.println("2. Laptop");
		int nhap = scanner.nextInt();

		DienThoaiThongMinh phone1 = new DienThoaiThongMinh();
		phone1.hangSanXuat = "Samsung";
		phone1.tenSanPham = "Samsung Galaxy";
		phone1.camera = "20px";
		phone1.giaBan = 100;
		phone1.heDieuHanh = "Android";
		phone1.manHinh = "ABC";
		
		Laptop laptop = new Laptop();
		laptop.tenSanPham = "Think book";
		laptop.hangSanXuat = "Lenovo";
		laptop.giaBan = 200;
		laptop.chipDoHoa = "AMD";
		laptop.chipXuLy = "intel corei5";
		laptop.ram = "8gb";
		
		switch (nhap) {
		case 1:
			phone1.hienThongTin();
			break;
		case 2:
			laptop.hienThongTin();
			break;
		default:
			break;
		}
	}
}
