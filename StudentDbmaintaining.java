package com.pdf.converting;

import java.util.ArrayList;

public class StudentDbmaintaining {
	public static ArrayList<Student> listObjects() {
		ArrayList<Student> list = new ArrayList<Student>();
		int j = 1;
		for (int i = 0; i < 4; i++) {
			list.add(new Student(101 + j, "Ganesh", Student.getCollegeName()));
			j += 1;
		}
		return list;
	}
}
