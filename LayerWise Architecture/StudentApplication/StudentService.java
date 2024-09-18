package com.evergent.StudentApplication;
public class StudentService {
	                           //100      corejava    250
	public int addStudentService(int studentId,String name,float score)
	{  String grade="";
	
	   if(score<=300)
	   {
		   grade = "C";
	   }
	   else if(score<=600)
	   {
		   grade = "B";
		   
	   }
	   else
	   {
		   grade = "A";
	   }
		
		
		StudentDAO studentDAO = new StudentDAO();
		StudentBean studentBean=new StudentBean();
	       studentBean.setStudentId(studentId);	
	       studentBean.setName(name);
	       studentBean.setScore(score);
	       studentBean.setGrade(grade);
	
		   int updateResult= studentDAO.addStudent(studentBean);
		
		return 1;
	} 
}
