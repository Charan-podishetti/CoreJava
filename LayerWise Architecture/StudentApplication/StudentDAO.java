package com.evergent.StudentApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

	// 100 corejava 250 c
	public int addStudent(StudentBean studentBean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = StudentDB.getConnection();
			String ins_str = "insert into book values(?,?,?,?)";
			pstmt = con.prepareStatement(ins_str);
			pstmt.setInt(1, studentBean.getStudentId());
			pstmt.setString(2, studentBean.getName());
			pstmt.setFloat(3, studentBean.getScore());
			pstmt.setString(4, studentBean.getGrade());
			int updateCount = pstmt.executeUpdate();
			con.close();
			return updateCount;

			/*
			 * studentList.add(studentBean.getStudentId());
			 * studentList.add(studentBean.getName());
			 * studentList.add(studentBean.getScore());
			 * studentList.add(studentBean.getGrade());
			 

			System.out.println(studentList);

			System.out.println("Student ID :" + studentBean.getStudentId());
			System.out.println("Student Name :" + studentBean.getName());
			System.out.println("Student Score :" + studentBean.getScore());
			System.out.println("Student Grade :" + studentBean.getGrade());

			return 1;
			*/
		} catch (Exception e) {
			System.out.println(e.toString());
			return 0;
		}
	}

}
