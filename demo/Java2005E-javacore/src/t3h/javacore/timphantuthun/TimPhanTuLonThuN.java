package t3h.javacore.timphantuthun;

import java.util.Scanner;

public class TimPhanTuLonThuN {
	
	public static void main(String[] args) {
		int[] soNguyen = {5, 5, 89, 55, 182, 54, 54, 44, 154};
		
		for (int i = 0; i < soNguyen.length; i++) {
			for (int j = i + 1; j < soNguyen.length; j++) {
				int left = soNguyen[i];
				int right = soNguyen[j];
				if (left < right) {
					int temp = soNguyen[i];
					soNguyen[i] = soNguyen[j];
					soNguyen[j] = temp;
				}
			}
		}
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		System.out.println(soNguyen[input - 1]);
	}

}
