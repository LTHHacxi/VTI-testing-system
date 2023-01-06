package com.VTI.frontend;

public class demo {
	public static void main(String[] args) {
// taọ biến để lưu thông tin các học viên
		String name1 = "chinh";
		String name2 = "toan";
		String name3 = "nam";
		String name4 = "dat";

// array: mảng dữ liệu=> lưu trữ dữ liệu tương đồng về kiểu
// khai bào mảng dùng để lưu thông tin các học viên
// cách 1:
		String[] nameHV = new String[4];
// đưa phần tử vào mảng
		nameHV[0] = "chinh";
		nameHV[1] = "toan";
		nameHV[2] = "nam";
		nameHV[3] = "dat";
// show ra
		System.out.println("Thông tin HV:");
		System.out.println("TTHV 1: " + nameHV[0]);
		System.out.println("TTHV 2: " + nameHV[1]);
// cách 2:
		String[] nameHV_1 = { "chinh", "toan", "nam" };
// show ra
		System.out.println("TTHV 1: " + nameHV_1[0]);
		System.out.println("TTHV 2: " + nameHV_1[1]);
	}
}
