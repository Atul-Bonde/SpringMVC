package com.SpringMVCCrudOeration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringMVCCrudOeration.model.Student;

@Repository
public interface Studentrepository extends JpaRepository<Student, Integer>{

}
