package com.Project.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Project.Entity.student;
import com.Project.Repositories.StudentRepository;

@Service
public class StudentService_impl implements StudentService {
	
	@Autowired
	private StudentRepository Studentrepo;

	@Override
	public void savestudent(student Student) {
		Studentrepo.save(Student);
		
	}

}
