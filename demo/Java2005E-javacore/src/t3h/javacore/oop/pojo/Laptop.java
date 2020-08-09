package t3h.javacore.oop.pojo;

public class Laptop {
	
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		
		laptop.taoId();
	}

	private String id;
	private String hangSanXuat;
	private String tenSanPham;
	private int giaBan;
	private String chipXuLy;
	private String chipDoHoa;
	private String ram;
	
	public String taoId() {
		String prefix = "SAMSUNG";
		String content = "0001";
		return prefix + content;
	}
	
	public String getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = "ABC-" + hangSanXuat;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public int getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}
	public String getChipXuLy() {
		return chipXuLy;
	}
	public void setChipXuLy(String chipXuLy) {
		this.chipXuLy = chipXuLy;
	}
	public String getChipDoHoa() {
		return chipDoHoa;
	}
	public void setChipDoHoa(String chipDoHoa) {
		this.chipDoHoa = chipDoHoa;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
}
