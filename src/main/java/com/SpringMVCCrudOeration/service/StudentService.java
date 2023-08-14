package com.SpringMVCCrudOeration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVCCrudOeration.model.Student;
import com.SpringMVCCrudOeration.repository.Studentrepository;

@Service
public class StudentService implements StudentServiceI {

	@Autowired
	private Studentrepository studentrepository;

	@Override
	public boolean saveStudent(Student stu) {

		Student save = studentrepository.save(stu);
		if (save != null) {

			return true;
		} else {

			return false;

		}
	}

	@Override
	public List<Student> getallstudent() {

		List<Student> findAll = studentrepository.findAll();

		return findAll;
	}

	@Override
	public Student getstudentbyqueryparam(int id) {

		Student student = studentrepository.findById(id).get();

		return student;
	}

	@Override
	public Student getstudentbypathparam(int id) {

		Student student = studentrepository.findById(id).get();

		return student;
	}

	@Override
	public boolean updatestudent(Student stu) {

		Student save = studentrepository.save(stu);

		if (save != null) {

			return true;
		}

		else {

			return false;
		}
	}

	@Override
	public boolean deleteStudentbyid(int id) {

		boolean existsById = studentrepository.existsById(id);

		if (existsById) {

			studentrepository.deleteById(id);

			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteallStudent() {

		List<Student> findAll = studentrepository.findAll();

		if (findAll.isEmpty()) {

			return false;
		} else {
			studentrepository.deleteAll();

			return true;
		}
	}

}
