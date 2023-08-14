package com.SpringMVCCrudOeration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SpringMVCCrudOeration.model.Student;
import com.SpringMVCCrudOeration.service.StudentServiceI;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceI studentServiceI;

	@GetMapping("/loadform")
	public String getform() {

		return "welcome";

	}

	@GetMapping("/savestudent")
	public ModelAndView saveStudent(Student stu) {

		boolean saveStudent = studentServiceI.saveStudent(stu);

		if (saveStudent) {

			String msg = "Student Details Added Successfully";
			ModelAndView mav = new ModelAndView();
			mav.addObject("SAVE", msg);
			mav.setViewName("save");
			return mav;

		} else {

			String msg = "Student Details not saved";
			ModelAndView mav = new ModelAndView();
			mav.addObject("FAIL", msg);
			mav.setViewName("fail");
			return mav;
		}
	}

	@GetMapping("/list")
	public ModelAndView getallStudents() {

		List<Student> getallstudent = studentServiceI.getallstudent();

		ModelAndView mav = new ModelAndView();
		mav.addObject("LIST", getallstudent);
		mav.setViewName("students");
		return mav;

	}
	
	@GetMapping("/getstudentbyqueryparam")
	public String getstudentbyqueryparam(@RequestParam int id,Model model) {
		
		Student getstudentbyqueryparam = studentServiceI.getstudentbyqueryparam(id);
		
		model.addAttribute("STUQUERY", getstudentbyqueryparam);
		
		return "student";
		
	}
	
	@GetMapping("/getstudentbypathparam/{id}")
	public String getstudentbypathparam(@PathVariable int id,Model model) {
		
		Student getstudentbypathparam = studentServiceI.getstudentbypathparam(id);
		
		model.addAttribute("STUPATH", getstudentbypathparam);
		
		return "student";
		
	}
	
	@GetMapping("/preupdate")
	public String update() {
		
		return "updateform";
	}

	@GetMapping("/updatestudent")
	public ModelAndView updateStudent(Student stu) {
		
		boolean updatestudent = studentServiceI.updatestudent(stu);
		
		if(updatestudent) {
		
	     String msg="Student Details Updated Succefully.";
			
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("UPDATE", msg);
		
		mav.setViewName("UPDATESUCC");
		
		return mav;
		}
		
		else {
			String msg="Student Details Not Updated";
			
			ModelAndView mav=new ModelAndView();
			
			mav.addObject("NOTUPDATE", msg);
			
			mav.setViewName("UPDATESUCC");
			
			return mav;
			}
		
	}
	
	@GetMapping("/delete")
	public ModelAndView deletestudent(@RequestParam  int id) {
		
		boolean deleteStudentbyid = studentServiceI.deleteStudentbyid(id);
		
		if(deleteStudentbyid) {
			
			String msg="Student Details Deleted";
			ModelAndView mav=new ModelAndView();
			mav.addObject("DELETE", msg);
			mav.setViewName("delete");
			return mav;
			
		}
	
		else {
			
			String msg="Student Details not Deleted";
			ModelAndView mav=new ModelAndView();
			mav.addObject("NOTDELTE", msg);
			mav.setViewName("delete");
			return mav;
			
		}
	}
	
	
	@GetMapping("/deleteallStudents")
	public String delteall(Model model) {
		
		      boolean deleteallStudent = studentServiceI.deleteallStudent();
		      
		      if(deleteallStudent) {
		    	  
		    	  String msg="All Students Details Deleted";
		    	  model.addAttribute("ALLDELETED", msg);
		    	  return "alldeleted";
		    	  
		      }
		      else {
		    	  
		    	  String msg="Student Table is Empty";
		    	  model.addAttribute("NOTALLDELETED", msg);
		    	  return "alldeleted";
		      }
		
	}
	
	                  
}
