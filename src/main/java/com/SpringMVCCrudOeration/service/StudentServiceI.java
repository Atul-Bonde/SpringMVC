package com.SpringMVCCrudOeration.service;

import java.util.List;

import com.SpringMVCCrudOeration.model.Student;



public interface StudentServiceI {
	
	public boolean saveStudent(Student stu);
	
	public List<Student> getallstudent();
	
	public Student getstudentbyqueryparam(int id);
	
	public Student getstudentbypathparam(int id);
	
	public boolean updatestudent( Student stu);
	
	public boolean deleteStudentbyid(int id);
	
	public boolean deleteallStudent();

}
