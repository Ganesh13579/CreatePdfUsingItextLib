package com.pdf.converting;

public class Student {
	private int stuId;
	private String stuName;
	private static String collegeName = "vrsec";

	public Student(int stuId, String stuName, String collegeName) {
		this.stuId = stuId;
		this.stuName = stuName;
		Student.collegeName = collegeName;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}

}
